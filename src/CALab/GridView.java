package CALab;

import javax.swing.*;

import mvc.*;
import java.awt.*;

public class GridView extends View {
    public Grid grid;
    private CellView[][] cellViews;
    public GridView(Grid grid) {
        super(grid);
        this.grid = grid;
        this.cellViews = new CellView[grid.dim][grid.dim];
        setLayout(new GridLayout(grid.dim, grid.dim));
        for ( int y = 0; y < grid.dim; y++ ) {
            for ( int x = 0; x < grid.dim; x++ ) {
                CellView current = new CellView( grid.getCell(y, x) );
                if (this.cellViews != null && this.cellViews[y] != null) {
                    this.cellViews[y][x] = current;
                }
                add(current);
            }
        }
    }

    public void update() {;
        // Iterate through cellViews and update each one
        for (CellView[] cellView : this.cellViews) {
            for (CellView view : cellView) {
                view.update();
            }
        }
    }

}