public class Stopwatch {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000); // simulate 2 sec task
        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start) + " ms");
    }
}