//@@author TomLBZ

package command.action;

import command.ParamNode;
import data.Data;
import data.jobs.ToDo;

/**
 * The type Todo action.
 */
public class TodoAction extends Action {

    private String description;

    @Override
    public String act(Data data) throws Exception {
        String result = super.act(data);
        ToDo todo = new ToDo(description);
        data.addTask(todo);
        return replaceStrings(result, todo.toString(), data.tasks.size());
    }

    @Override
    public void prepare(ParamNode args) throws Exception {
        super.prepare(args);
        description = args.thisData.toFlatString();
    }
}
