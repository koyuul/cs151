package CALab;

import mvc.AppFactory;
import mvc.Command;
import mvc.Model;
import mvc.View;

import java.awt.*;

// must be abstract i guess. so it doesnt do makemodel, but life factory must do it
// life packages needs: society, agent, lifepanel (in main), lifefactory (needs model, makemodel returns new society)
//      makeModel() { return new society() };
public abstract class GridFactory implements AppFactory {
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
