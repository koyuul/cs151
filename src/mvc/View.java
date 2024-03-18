package mvc;
/*
    Edits:
        Kyle 3/5: Created file
 */
import javax.swing.*;

public class View extends JPanel implements Subscriber {
    public Model model;
    public View(Model model) {
        this.model = model;
        this.model.subscribe(this);
    }
    @Override
    public void update() {
        this.repaint();
    }
    public void setModel(Model model) {
        this.model.unsubscribe(this);
        this.model = model;
        this.model.subscribe(this);
    }
}
