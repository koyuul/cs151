package CALab;

import mvc.Command;
import mvc.Model;

public class ClearCommand extends Command {
    Model model;
    public ClearCommand(Model model) {
        super(model);
        this.model = model;
    }

    public void execute() throws Exception {
        System.out.println("Running clear...");
        Grid grid = (Grid)this.model;
        grid.repopulate(false);
    }
}