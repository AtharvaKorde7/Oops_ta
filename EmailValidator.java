import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println(email + " is valid? " + matcher.matches());
    }
}