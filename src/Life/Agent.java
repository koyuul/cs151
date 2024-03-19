package Life;

import CALab.Cell;

import java.awt.*;

import static mvc.Utilities.rng;

public class Agent extends Cell {
    public int state = 0; // 0 = dead, 1 = alive
    public int ambience = 8;
    public Society society;
    @Override
    public void observe() {
        this.ambience = this.society.getNeighbors(this, 1).size();
        this.notifySubscribers();
    }

    @Override
    public void interact() {
        // no interaction phase, so do nothing :D
    }

    @Override
    public void update() {
        if (Society.rebirth.contains(this.ambience)) this.state = 1;
        if (Society.death.contains(this.ambience)) this.state =  0;
        this.notifySubscribers();
    }

    @Override
    public void reset(boolean randomly) {
        if (randomly) {
            this.state = rng.nextInt(2); // random 0 or 1;
            this.ambience = this.society.getNeighbors(this, 1).size();
        } else {
            this.state = 0;
            this.ambience = this.society.getNeighbors(this, 1).size();
        }
        this.notifySubscribers();
    }

    @Override
    public int getStatus() {
        return this.state;
    }

    @Override
    public void nextState() {
        if (this.state == 1) this.state = 0;
        else if (this.state == 0) this.state = 1;
    }

    @Override
    public Color getColor() {
        if (this.state == 0){
            return Color.RED;
        } else {
            return Color.GREEN;
        }
    }
}
