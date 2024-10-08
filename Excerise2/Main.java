package Excerise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Astronaut Schedule Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter description:");
                        String description = scanner.nextLine();
                        System.out.println("Enter start time (HH:MM):");
                        String startTime = scanner.nextLine();
                        System.out.println("Enter end time (HH:MM):");
                        String endTime = scanner.nextLine();
                        System.out.println("Enter priority (Low/Medium/High):");
                        String priority = scanner.nextLine();
                        
                        Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                        scheduleManager.addTask(task);
                        System.out.println("Task added successfully.");
                        break;

                    case 2:
                        System.out.println("Enter task description to remove:");
                        String removeDescription = scanner.nextLine();
                        scheduleManager.removeTask(removeDescription);
                        System.out.println("Task removed successfully.");
                        break;

                    case 3:
                        System.out.println("Scheduled tasks:");
                        scheduleManager.getTasks().forEach(t -> System.out.println(t.getStartTime() + " - " + t.getEndTime() + ": " + t.getDescription() + " [" + t.getPriority() + "]"));
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (TaskConflictException | InvalidTimeFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

