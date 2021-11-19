package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client ();
        client.setName("True Name Joe");
        client.setYearOfBirth(1985);
        client.setAddress("True Address NewYork");

        System.out.println("True Név: " + client.getName());
        System.out.println("True Év:" + client.getYearOfBirth());
        System.out.println("True Cím: " + client.getAddress());

        client.migrate("Rewritten Cím Berlin");
        System.out.println("New Cím: " + client.getAddress());
    }
}