package stringtype;
public class UservValidator {

    public boolean isValidUsername(String username) {
        return !"".equals(username);
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8
                && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int hasAt = email.indexOf('@');
        String domain = email.substring(hasAt + 1);
        int hasDot = domain.indexOf('.');
        return hasAt > 0
                && hasDot > 0
                && hasDot < domain.length() - 1;
    }
}