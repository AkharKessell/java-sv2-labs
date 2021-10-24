package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {

    private String artist;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;

    public Performance(String artist, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.artist = artist;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
    }
    public String getInfo() {
        return artist + ": " + date + " " + startTime + "-" + endTime;
    }
    public String getArtist() {
        return artist;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public LocalDate getDate() {
        return date;
    }
}
