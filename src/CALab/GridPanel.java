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

//
//        setLayout(new GridLayout(1, 2));
//
//        //left side 1
//        JPanel leftPanel = new JPanel(new GridLayout(1, 2));
//        leftPanel.setBackground(Color.LIGHT_GRAY);
//        add(leftPanel);
//
//        // left side 2
//        JPanel leftSide = new JPanel(new GridLayout(2, 2));
//        leftPanel.add(leftSide);
//
//        JPanel panelOne = new JPanel();
//        panelOne.setBackground(Color.LIGHT_GRAY);
//        JButton button1 = new JButton("Run1");
//        panelOne.add(button1);
//        leftSide.add(panelOne);
//
//        JPanel panelTwo = new JPanel();
//        panelTwo.setBackground(Color.LIGHT_GRAY);
//        JButton button2 = new JButton("Run 50");
//        panelTwo.add(button2);
//        leftSide.add(panelTwo);
//
//        JPanel panelThree = new JPanel();
//        panelThree.setBackground(Color.LIGHT_GRAY);
//        JButton button3 = new JButton("Populate");
//        panelThree.add(button3);
//        leftSide.add(panelThree);
//
//        JPanel panelFour = new JPanel();
//        panelFour.setBackground(Color.LIGHT_GRAY);
//        JButton button4 = new JButton("CLEAR");
//        panelFour.add(button4);
//        leftSide.add(panelFour);
//
//        // CHECK THIS WORKING? TODO...
//        JPanel rightPanel = new JPanel(new BorderLayout());
//        rightPanel.setBackground(Color.LIGHT_GRAY);
//        add(rightPanel);

        //add grid
//        gridView = new GridView((Grid) factory.makeModel());
//        gridView = factory.makeView();
//        rightPanel.add(gridView, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        AppFactory factory = new GridFactory();
        AppPanel panel = new GridPanel(factory);
        panel.display();
//        JFrame frame = new JFrame("CA LAB");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        GridFactory factory = new GridFactory();
//        GridPanel gridPanel = new GridPanel(factory);
//
//        frame.setLayout(new BorderLayout());
//        frame.add(gridPanel, BorderLayout.CENTER);
//
//        frame.setSize(800, 600);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
    }
}
