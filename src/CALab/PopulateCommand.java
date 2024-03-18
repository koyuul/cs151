package CALab;

import mvc.Command;
import mvc.Model;

public class PopulateCommand extends Command {
    Model model;
    public PopulateCommand(Model model) {
        super(model);
        this.model = model;
    }
    public void execute() throws Exception {
        System.out.println("Running populate...");
        Grid grid = (Grid)this.model;
        grid.repopulate(true);
    }
}
