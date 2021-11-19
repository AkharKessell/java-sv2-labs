package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String userName) {
        int lenght = userName.length();
        return lenght > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        int lenght = password1.length();
        boolean passEquals = password1.equals(password2);
        return ((lenght >= 8) && passEquals);
    }

    public boolean isValidEmail(String email) {
        int indexOfAt = email.indexOf("@");
        int indexOfPeriod = email.indexOf(".");
        int lenght = email.length();
        return ((indexOfAt > 0) && (indexOfPeriod > indexOfAt + 1) && (indexOfPeriod < lenght - 1));
    }
}