package command.action;

import command.ParamNode;
import data.Data;

public class ListAction implements Action {

    private ParamNode args;

    @Override
    public boolean act(Data tasks) {
        tasks.updateListUI(null);
        return true;
    }

    @Override
    public void prepare(ParamNode args) {
        this.args = args;
    }
}
