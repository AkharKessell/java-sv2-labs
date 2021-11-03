package src.main.java.looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student01 = new Student("Viczián István");
        students.add(student01);
        Student student02 = new Student("Kovács Enikő");
        students.add(student02);
        Student student03 = new Student("Bárczay Kristóf");
        students.add(student03);
        Student student04 = new Student("Tóth Enikő");
        students.add(student04);

        System.out.println("Students list :" + students.size());

        student01.setActive(false);
        student03.setActive(false);

        List<Student> inactieList = new ArrayList<>();
        for (Student item: students) {
            if (item.isActive() == false) {
                inactieList.add(item);
            }
        }
        students.removeAll(inactieList);
        System.out.println("New List:" + students.size());
    }
}