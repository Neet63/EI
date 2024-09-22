package Excerise2;

import java.time.LocalTime;

public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priority) throws InvalidTimeFormatException {
        try {
            LocalTime start = LocalTime.parse(startTime);
            LocalTime end = LocalTime.parse(endTime);
            if (start.isAfter(end)) {
                throw new InvalidTimeFormatException("Start time cannot be after end time.");
            }
            return new Task(description, start, end, priority);
        } catch (Exception e) {
            throw new InvalidTimeFormatException("Invalid time format.");
        }
    }
}

