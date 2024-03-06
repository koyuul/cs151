package stopLight;
/*
    Edits:
        Kyle 3/5:   Created file, pasted in provided code
 */

import mvc.*;

public class ChangeCommand extends Command {

    public ChangeCommand(Model model) {
        super(model);
    }

    public void execute() {
        Stoplight light = (Stoplight)model;
        light.change();
    }

}