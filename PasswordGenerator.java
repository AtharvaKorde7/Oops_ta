import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$!";
        StringBuilder pass = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            pass.append(chars.charAt(rand.nextInt(chars.length())));
        System.out.println("Generated Password: " + pass);
    }
}