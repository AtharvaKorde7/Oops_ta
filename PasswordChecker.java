public class PasswordChecker {
    public static void main(String[] args) {
        String password = "Hello@123";

        boolean strong = password.length() >= 8 &&
                         password.matches(".*[A-Z].*") &&
                         password.matches(".*[a-z].*") &&
                         password.matches(".*[0-9].*") &&
                         password.matches(".*[@#$%^&+=!].*");

        System.out.println("Password is strong? " + strong);
    }
}