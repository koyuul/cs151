package Life;

import CALab.GridFactory;
import CALab.GridPanel;
import mvc.AppFactory;

public class LifePanel extends GridPanel {
    public LifePanel(AppFactory factory) {
        super(factory);
    }

    public static void main(String[] args) { // This code was created in class. Should be untouched...
        GridFactory factory = new LifeFactory();
        GridPanel panel = new GridPanel(factory);
        panel.display();
    }
}
