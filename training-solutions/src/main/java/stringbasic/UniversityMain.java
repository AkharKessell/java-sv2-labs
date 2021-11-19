package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        University university = new University();

        university.addStudent(new Student(new Person("Student01", "Student01@mail.com", "AG332-111", "1111-1111-1111", "705002040"), "66666", "666"));
        university.addStudent(new Student(new Person("Student02", "Student02@mail.com", "AD543-432", "2222-2222-2222", "309857412"), "99999", "999"));
        university.addStudent(new Student(new Person("Student03", "Student03@mail.com", "JAJ34-435", "3333-3333-3333", "204684357"), "66666", "666"));

        System.out.println(university.areEqual(university.getStudents().get(0), university.getStudents().get(1)));
        System.out.println(university.areEqual(university.getStudents().get(0), university.getStudents().get(2)));
    }
}