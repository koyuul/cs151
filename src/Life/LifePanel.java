package Life;

import CALab.GridFactory;
import CALab.GridPanel;
import mvc.AppFactory;

public class LifePanel extends GridPanel {
    public LifePanel(AppFactory factory) {
        super(factory);
    }

    public static void main(String[] args) { // This code was created in class. Should be untouched...
        GridPanel panel = new GridPanel(new LifeFactory());
        panel.display();
    }
}
