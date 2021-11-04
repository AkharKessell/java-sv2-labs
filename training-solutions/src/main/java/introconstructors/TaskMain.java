package src.main.java.introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Gardening","root out weeds");

        task.setDuration(100);
        task.start();
        System.out.println("Task: " + task.getTitle());
        System.out.println("Task description: " + task.getDescription());
        System.out.println("Task duration: " + task.getDuration() + " min");
        System.out.println("Task Start: " + task.getStartDateTime());

    }


}
