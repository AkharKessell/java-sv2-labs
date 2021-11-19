package looptypes;

import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students) {

        for (String name: students) {

            if (name.length() <= 10) {
                System.out.println("Group 01: " + name);
            } else {
                System.out.println("Group 02: " + name);
            }
        }
    }
}
