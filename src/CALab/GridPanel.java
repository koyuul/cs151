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
        JPanel buttonsContainer = new JPanel(new GridLayout(2, 2));
        Dimension buttonsContainerSize = new Dimension(150, 100);

        runone = new JButton("RUN1");
        runone.addActionListener(this);
        runone.setPreferredSize(buttonsContainerSize);
        buttonsContainer.add(runone, BorderLayout.NORTH);

        runfifty = new JButton("RUN50");
        runfifty.addActionListener(this);
        runfifty.setPreferredSize(buttonsContainerSize);
        buttonsContainer.add(runfifty, BorderLayout.NORTH);

        populate = new JButton("POPULATE");
        populate.addActionListener(this);
        populate.setPreferredSize(buttonsContainerSize);
        buttonsContainer.add(populate, BorderLayout.NORTH);

        clear = new JButton("CLEAR");
        clear.addActionListener(this);
        clear.setPreferredSize(buttonsContainerSize);
        buttonsContainer.add(clear, BorderLayout.NORTH);


        controlPanel.add(buttonsContainer);
    }

    // Main does not exist here, but instead in an inheriting panel (In this case, LifePanel)
}
