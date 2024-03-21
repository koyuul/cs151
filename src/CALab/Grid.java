package CALab;

import java.awt.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

import mvc.*;

import static mvc.Utilities.rng;

public abstract class Grid extends Model {
    static private int time = 0;
    protected int dim = 20;
    protected Cell[][] cells;

    public int getDim() { return dim; }
    public int getTime() { return time;  }
    public Cell getCell(int row, int col) { return cells[row][col]; }
    public abstract Cell makeCell();

    public Grid(int dim) {
        this.dim = dim;
        cells = new Cell[dim][dim];
        populate();
    }
    public Grid() { this(20); }

    protected void populate() {
        for (int y = 0; y < dim; y++){
            for (int x = 0; x < dim; x++) {
                Cell c = makeCell();
                c.col = x;
                c.row = y;
                c.myGrid = this;
                c.neighbors = getNeighbors(c, 1);
                this.cells[y][x] = c;
                c.choosePartner();
                c.notifySubscribers();
            }
        }
    }

    // called when Populate and clear buttons are clicked
    public void repopulate(boolean randomly) {
        for (int y = 0; y < dim; y++) {
            for (int x = 0; x < dim; x++) {
                Cell current = getCell(y, x);
                if (randomly) {
                    current.reset(rng.nextBoolean());
                } else {
                    current.reset(false);
                }
                current.choosePartner();
                current.notifySubscribers();
            }
        }
    }


    //TODO: Update this to handle a radius, and edgecases
    public Set<Cell> getNeighbors(Cell asker, int radius) {
        /*
        return the set of all cells that can be reached from the asker in radius steps.
        If radius = 1 this is just the 8 cells touching the asker.
        Tricky part: cells in row/col 0 or dim - 1.
        The asker is not a neighbor of itself.
        */
        Set<Cell> ret = new HashSet<Cell>();
        for (int x = -1 ; x < 2; x++) { // read top mid bottom
            for (int y = -1; y < 2; y++) { // read left mid right
                if (x != 0 || y!= 0) { // if not self
                    int rx = Math.floorMod(asker.col + x, dim);
                    int ry = Math.floorMod(asker.row + y, dim);
                    Cell current = getCell(ry, rx);
                    if (current != null && current.getColor().equals(Color.GREEN)) {
                        ret.add(current);
                        System.out.print("neighbor detected at: " + rx + " " + ry + ". ");
                        System.out.println("neighbor at +" + x + " +" + y);
                    }
                }
            }
        }
        return ret;
    }

    public void observe() {
        // call each cell's observe method and notify subscribers
        for (int y = 0; y < dim; y++) {
            for (int x = 0; x < dim; x++) {
                Cell c = getCell(y, x);
                c.observe();
                c.notifySubscribers();
            }
        }
        notifySubscribers();
    }

    public void interact() {
        // ???
        for (int y = 0; y < dim; y++) {
            for (int x = 0; x < dim; x++) {
                Cell c = getCell(y, x);
                c.interact();
                c.notifySubscribers();
            }
        }
        notifySubscribers();
    }

    public void update() {
        // ???
        for (int y = 0; y < dim; y++) {
            for (int x = 0; x < dim; x++) {
                Cell c = getCell(y, x);
                c.update();
                c.notifySubscribers();
            }
        }
        notifySubscribers();
    }

    public void updateLoop(int cycles) {
        observe();
        for(int cycle = 0; cycle < cycles; cycle++) {
            interact();
            update();
            observe();
            notifySubscribers();
            time++;
            System.out.println("time = " + time);
        }
    }
}