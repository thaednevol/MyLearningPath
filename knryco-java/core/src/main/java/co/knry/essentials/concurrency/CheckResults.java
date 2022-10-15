package co.knry.essentials.concurrency;

import java.util.concurrent.*;

public class CheckResults {

    private static int counter = 0;
    public static void main(String[] unused) throws Exception{
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> result = service.submit(() -> {
                for(int i = 0; i < 1_000_000; i++) counter++;
            });
            result.get(10, TimeUnit.MINUTES); // Returns null for Runnable
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            service.shutdown();
        }
        }

}

