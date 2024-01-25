public class CheckingRuntime {

    public static void main(String[] args) throws InterruptedException {

        long start = System.nanoTime();

        Thread.sleep(3000);

        long duration = (System.nanoTime() - start) / 1000000;

        System.out.println("Runtime is at: " + duration + "ms");

    }

}
