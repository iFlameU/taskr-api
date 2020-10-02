package taskr;

import model.task.Task;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("taskr")
public class Taskr {

    private static ArrayList<Task> tasks = new ArrayList<>();

    @GET
    public List<Task> get() {
        return tasks;
    }

    @POST
    public void add(@Valid Task task) {
        tasks.add(task);
    }
}
