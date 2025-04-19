public class Palindrome {
    public static void main(String[] args) {
        String text = "madam";
        String reverse = new StringBuilder(text).reverse().toString();
        System.out.println("Is palindrome? " + text.equals(reverse));
    }
}