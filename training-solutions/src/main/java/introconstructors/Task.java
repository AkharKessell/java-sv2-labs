package introconstructors;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDateTime getStartDateTime() {
        return this.startDateTime;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {this.startDateTime = LocalDateTime.now();
    }
}
