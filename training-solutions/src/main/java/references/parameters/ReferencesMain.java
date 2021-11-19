package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {

        Person person01;
        Person person02;
        person01 = new Person("John",22);
        person02 = person01;
        person02.setName("Jack");
        System.out.println(person01.getName());
        System.out.println(person02.getName());
        int i = 24;
        int a = i;
        a++;
        System.out.println(i);
        System.out.println(a);
        person01=new Person("Jill", 15);
        System.out.println(person01.getName());
        System.out.println(person02.getName());
    }
}
