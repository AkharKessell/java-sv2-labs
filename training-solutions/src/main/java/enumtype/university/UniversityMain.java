package src.main.java.enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        System.out.println(University.valueOf("BME").name);
        System.out.println(University.valueOf("MKE").name);
        System.out.println(University.valueOf("NKE").name);
    }
}
