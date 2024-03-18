package CALab;

import mvc.Command;
import mvc.Model;

public class RunCommand extends Command {
    Model model;
    int cycles;
    public RunCommand(Model model, int cycles) {
        super(model);
        this.model = model;
        this.cycles =  cycles;
    }

    //TODO: make this handle diff # of cycles
    public void execute() throws Exception {
        System.out.println("Running run...");
        Grid grid = (Grid)this.model;
        grid.updateLoop(cycles);
    }
}