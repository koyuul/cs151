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
        Dimension buttonsContainerSize = new Dimension(120,  20);

        JPanel panelOne = new JPanel();
        runone = new JButton("RUN1");
        runone.addActionListener(this);
        runone.setPreferredSize(buttonsContainerSize);
        panelOne.add(runone);
        buttonsContainer.add(panelOne, BorderLayout.NORTH);

        JPanel panelTwo = new JPanel();
        runfifty = new JButton("RUN50");
        runfifty.addActionListener(this);
        runfifty.setPreferredSize(buttonsContainerSize);
        panelTwo.add(runfifty);
        buttonsContainer.add(panelTwo, BorderLayout.NORTH);

        JPanel panelThree = new JPanel();
        populate = new JButton("POPULATE");
        populate.addActionListener(this);
        populate.setPreferredSize(buttonsContainerSize);
        panelThree.add(populate);
        buttonsContainer.add(panelThree, BorderLayout.NORTH);

        JPanel panelFour = new JPanel();
        clear = new JButton("CLEAR");
        clear.addActionListener(this);
        clear.setPreferredSize(buttonsContainerSize);
        panelFour.add(clear);
        buttonsContainer.add(panelFour, BorderLayout.NORTH);

        controlPanel.add(buttonsContainer);
    }

    // Main does not exist here, but instead in an inheriting panel (In this case, LifePanel)
}
