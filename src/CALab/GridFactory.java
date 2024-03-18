package CALab;

import mvc.AppFactory;
import mvc.Command;
import mvc.Model;
import mvc.View;

import java.awt.*;

public class GridFactory implements AppFactory {
    // TODO: ASK PROF how to implement makemodel when Grid is abstract? Can't cast model to Grid
    @Override
    public Model makeModel() {
        return new Model();
    }
    @Override
    public View makeView(Model model) {
        return new GridView((Grid)model);
    }

    @Override
    public String getTitle() {
        return "CALab";
    }

    @Override
    public String[] getHelp() {
        return new String[] {"CALab Help"};
    }

    @Override
    public String about() {
        return "CALab version 1.0. for CS151";
    }

    @Override
    public String[] getEditCommands() {
        return new String[] {"RUN1", "RUN50", "POPULATE", "CLEAR"};
    }

    @Override
    public Command makeEditCommand(Model model, String type) {
        switch (type) {
            case "RUN1":
                return new RunCommand(model, 1);
            case "RUN50":
                return new RunCommand(model, 50);
            case "POPULATE":
                return new PopulateCommand(model);
            case "CLEAR":
                return new ClearCommand(model);
            default:
                System.out.println("no command detected...");
                return null;
        }
    }

}
