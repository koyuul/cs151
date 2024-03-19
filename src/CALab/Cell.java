package CALab;

import java.awt.*;
import java.util.*;
import java.io.*;
import mvc.*;

import static mvc.Utilities.rng;

abstract public class Cell extends Publisher implements Serializable {
    protected int row = 0, col = 0;
    protected Set<Cell> neighbors = new HashSet<Cell>();
    protected Grid myGrid = null;
    protected Cell partner = null;


    // choose a random neighbor as a partner
    public void choosePartner() {
        if (partner == null && neighbors != null) {
            partner = null;
            ArrayList<Cell> potential_partners = new ArrayList<>(neighbors);
            if (potential_partners.size() == 0) return;
            int randomInRange = rng.nextInt(potential_partners.size());
            for (int i = randomInRange; i < potential_partners.size(); i++) {
                Cell current = potential_partners.get(i);
                if (current != null && current.partner == null) {
                    this.partner = current;
                    current.partner = this;
                    break;
                }
            }

        }

    }

    public void unpartner() {
        if (partner != null) {
            if (partner.partner != null) {
                partner.partner = null;
            }
            partner = null;
        }
    }

    // observer neighbors' states
    public abstract void observe();

    // interact with a random neighbor
    public abstract void interact();

    // update my state
    public abstract void update();

    // set status to a random or initial value
    public abstract void reset(boolean randomly);

    public abstract int getStatus();

    // set status to status + 1 mod whatever
    public abstract void nextState();

    public abstract Color getColor();
}
