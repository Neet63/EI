package Excerise2;
//Singleton

import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance = null;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) throws TaskConflictException {
        for (Task existingTask : tasks) {
            if (task.conflictsWith(existingTask)) {
                throw new TaskConflictException("Task conflicts with existing task: " + existingTask.getDescription());
            }
        }
        tasks.add(task);
        notifyObservers(task);
    }

    public void removeTask(String description) {
        tasks.removeIf(task -> task.getDescription().equals(description));
    }

    public List<Task> getTasks() {
        tasks.sort((task1, task2) -> task1.getStartTime().compareTo(task2.getStartTime()));
        return tasks;
    }

    private void notifyObservers(Task task) {
        // Notify observers in case of conflicts or updates
    }
}

