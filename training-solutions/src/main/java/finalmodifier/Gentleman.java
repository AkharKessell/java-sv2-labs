package finalmodifier;

public class Gentleman {
    public static final String MESSAGE_PREFIX = "Hello";
    public static String sayHello(String name) {
        return MESSAGE_PREFIX + name;
    }

    public static void main(String[] args) {
        String name = " John";
        System.out.println(sayHello(name));
    }
}
