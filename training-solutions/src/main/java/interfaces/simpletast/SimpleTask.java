package interfaces.simpletast;

import java.util.ArrayList;
import java.util.List;

public class SimpleTask implements Runnable {
    private final List<String> tasks;

    public SimpleTask(List<String> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        while (nextStep()) {

        }
    }

    private boolean nextStep() {
        if (tasks.size() != 0) {
            tasks.remove(tasks.size() - 1);
        }
        return tasks.size() != 0;
    }
}
