package collectionscomp;

import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class School {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student("John Doe", 160));
        students.add(new Student("Jack Doe", 170));
        students.add(new Student("Jane Doe", 180));

        System.out.println(students);

        Map<String, Integer> studentMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        studentMap.put("John Doe", 160);
        studentMap.put("Jack Doe", 170);
        studentMap.put("Jane Doe", 180);

        System.out.println(studentMap);
    }
}