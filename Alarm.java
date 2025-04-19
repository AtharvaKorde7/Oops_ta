public class Alarm {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Alarm set for 5 seconds...");
        Thread.sleep(5000);
        System.out.println("Wake up!");
    }
}