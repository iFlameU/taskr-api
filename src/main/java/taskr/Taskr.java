package taskr;

import model.task.Task;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("taskr")
public class Taskr {

    @GET
    public Response get() {
        return Response.ok().build();
    }

    @POST
    public Response add(@Valid Task task) {
        return Response.ok().build();
    }
}
