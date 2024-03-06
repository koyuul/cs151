package mvc;

/*
    Edits:
        Kyle 3/5:   Created file, copied in provided AppPanel code and
                    added nested control panel code.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppPanel extends JPanel implements ActionListener {
    public ControlPanel controlPanel;

    public AppPanel(AppFactory factory) {
        // add controls and sub-panels here
        controlPanel = new ControlPanel();
        this.add(controlPanel);

        // add frame and run:
        JFrame frame = new JFrame();
        Container cp = frame.getContentPane();
        cp.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Blank App");
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        // react to user input here
    }

    class ControlPanel extends JPanel {
        public ControlPanel() {
            setBackground(Color.PINK);
            JPanel p = new JPanel();
            JButton change = new JButton("Change");
            change.addActionListener(AppPanel.this);
            p.add(change);
            add(p);
        }
    }

    public static void main(String[] args) {
        AppPanel app = new AppPanel(factory);
    }

}
