package CALab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import mvc.*;


public class CellView extends JButton implements ActionListener, Subscriber {
    private Cell myCell;

    public CellView(Cell c) {
        myCell = c;
        c.subscribe(this);
        this.addActionListener(this);
        this.update();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (myCell != null) {
            myCell.nextState();
            this.update();
        } else {
            System.out.println("NULL");
        }
    }

    // called by notifySubscribers and GridView.update
    @Override
    public void update() {
        setBackground(myCell.getColor());
        setBorder(BorderFactory.createLineBorder(Color.black)); // needed?
        setText("" + myCell.getStatus());
    }
}