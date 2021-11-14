package controlselection.week;

public class DayOfWeeks {
    public String whichDay(String day) {
        switch (day.toLowerCase()) {
            case "monday":
                return "start of the week";
            case "tuesday", "wednesday", "thursday":
                return "midweek";
            case "friday":
                return "almost weekend";
            case "saturday", "sunday":
                return "weekend";
            default:
                return "unknown day";
        }
    }
}