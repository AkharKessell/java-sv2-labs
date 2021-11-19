package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroupMain {
    public static void main(String[] args) {
        StudyGroup group = new StudyGroup();

        List<String> students = Arrays.asList("Viczián István", "Bárczay Krisóf", "Kovács Enikő","Tóth Enikő");
        group.printStudyGroups(students);
    }
}
