package src.main.java.stringtype;
import java.util.Scanner;
public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("userName (must):");
        String username = scanner.nextLine();

        System.out.println("PassWord (Min 8 Char):");
        String password = scanner.nextLine();

        System.out.println("PassWord again:");
        String password2 = scanner.nextLine();

        System.out.println("E-mail address:");
        String email = scanner.nextLine();

        UservValidator userValidator = new UservValidator();

        System.out.println(userValidator.isValidUsername(username) ? "user ok" : "user declined");
        System.out.println(userValidator.isValidPassword(password, password2) ? "password ok" : "password declined");
        System.out.println(userValidator.isValidEmail(email) ? "e-mail ok" : "e-mail declined");
    }
}
