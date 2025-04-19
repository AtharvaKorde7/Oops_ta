public class WordCounter {
    public static void main(String[] args) {
        String input = "This is a Java word counter program";
        String[] words = input.split("\s+");
        System.out.println("Word Count: " + words.length);
    }
}