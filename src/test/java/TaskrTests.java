import model.task.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taskr.Taskr;

public class TaskrTests {

    @Test
    public void addTask() {
        Taskr taskr = new Taskr();
        Task testTask = createTestTask();
        taskr.add(testTask);
        Assertions.assertTrue(taskr.get().contains(testTask));
    }

    private Task createTestTask() {
        Task task = new Task();
        task.setName("Test");
        task.setDescription("Test description");
        return task;
    }
}
