package CALab;

import javax.swing.*;

import mvc.*;
import java.awt.*;

public class GridView extends View {

    private CellView cellViews[][];
//    Grid model = new Grid();
    public GridView(Grid grid) {
        super(grid);
        /*
        Cell cell = new CellView(((Grid)model).getCell(row, col)
        cellViews[row][col] = cell
        set cell.row and cell.col here
        */

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
        for (CellView[] cellView : cellViews) {
            for (CellView view : cellView) {
                view.update();
            }
        }
    }

}