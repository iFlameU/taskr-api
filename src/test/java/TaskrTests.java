import model.task.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taskr.Taskr;

public class TaskrTests {

    @Test
    public void getTasks() {
        Taskr taskr = new Taskr();
        Assertions.assertEquals(200, taskr.get().getStatus());
    }

    @Test
    public void addTask() {
        Taskr taskr = new Taskr();
        Assertions.assertEquals(200, taskr.add(createTestTask()).getStatus());
    }

    private Task createTestTask() {
        Task task = new Task();
        task.setName("Test");
        task.setDescription("Test description");
        return task;
    }
}
