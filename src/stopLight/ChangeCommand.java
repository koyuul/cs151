package stopLight;
/*
    Edits:
        Kyle 3/5:   Created file, pasted in provided code
 */

import mvc.*;

public class ChangeCommand extends Command {
    Model model;
    public ChangeCommand(Model model) {
        super(model);
        this.model = model;
        System.out.println("created");
    }
    public void execute() throws Exception {
        if (!(this.model instanceof Stoplight)) {
            throw new Exception("Model must instantiate Stoplight");
        }

        Stoplight light = (Stoplight)this.model;
        light.change();
    }
}