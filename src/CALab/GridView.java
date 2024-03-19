package CALab;

import javax.swing.*;

import mvc.*;
import java.awt.*;

public class GridView extends View {

    private CellView[][] cellViews;
    public GridView(Grid grid) {
        super(grid);
        for ( int y = 0; y < grid.dim; y++ ) {
            for ( int x = 0; x < grid.dim; x++ ) {
                CellView current = new CellView( grid.getCell(y, x) );
                if (this.cellViews != null && this.cellViews[y] != null) {
                    this.cellViews[y][x] = current;
                }
                add(current);
            }
        }
//        super(grid);
//        Grid gridModel = (Grid) model;
//
//        int dim = gridModel.getDim();
//        cellViews = new CellView[dim][dim];
//
//        setLayout(new GridLayout(dim, dim));
//
//        // Create and add CellViews to the grid
//        for (int row = 0; row < dim; row++) {
//            for (int col = 0; col < dim; col++) {
//                Cell cellModel = gridModel.getCell(row, col);
//                CellView cellView = new CellView(cellModel);
//                cellViews[row][col] = cellView;
//                add(cellView);
//            }
//        }
    }

    public void update(String msg, Object oldState, Object newState) {
        Grid updatedGrid = (Grid) newState;

        // Iterate through cellViews and update each one
        for (CellView[] cellView : this.cellViews) {
            for (CellView view : cellView) {
                view.update();
            }
        }
    }

}