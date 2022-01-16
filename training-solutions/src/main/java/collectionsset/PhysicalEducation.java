package collectionsset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {
    public static void main(String[] args) {
        PhysicalEducation physicalEducation = new PhysicalEducation();

        List<Student> students = Arrays.asList(
                new Student("John Doe", 111),
                new Student("Jack Doe", 222),
                new Student("James Doe", 333),
                new Student("Jill Doe", 444)
        );

        System.out.println(physicalEducation.getOrderInLessons(students));
    }

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> heights = new TreeSet<>();
        for (Student s : students) {
            heights.add(s.getHeight());
        }
        return heights;
    }
}