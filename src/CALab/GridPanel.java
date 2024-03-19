package CALab;

import mvc.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridPanel extends AppPanel {

    private GridView gridView; // Add GridView field
    private JButton runone;
    private JButton runfifty;
    private JButton populate;
    private JButton clear;

    public GridPanel(AppFactory factory) {
        super(factory);

        runone = new JButton("RUN1");
        runone.addActionListener(this);
        controlPanel.add(runone);

        runfifty = new JButton("RUN50");
        runfifty.addActionListener(this);
        controlPanel.add(runfifty);

        populate = new JButton("POPULATE");
        populate.addActionListener(this);
        controlPanel.add(populate);

        clear = new JButton("CLEAR");
        clear.addActionListener(this);
        controlPanel.add(clear);
    }

    // Main does not exist here, but instead in an inheriting panel (In this case, LifePanel)
}
