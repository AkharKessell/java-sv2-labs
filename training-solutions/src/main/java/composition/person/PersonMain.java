package composition.person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("John","DS12345");

        person.moveTo(new Address("USA","New York","Licoln Str","1551"));
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.getAddress().correctData("USA","Whasington","Dale Str","1678");
        System.out.println(person.getAddress().addressToString());
    }
}
