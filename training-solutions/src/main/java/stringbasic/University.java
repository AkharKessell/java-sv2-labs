package src.main.java.stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudents() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        boolean neptunCode = student.getNeptunCode().equals(anotherStudent.getNeptunCode());
        boolean eduId = student.getEduId().equals(anotherStudent.getEduId());
        return neptunCode & eduId;
    }
}
