package co.knry.essentials.concurrency;

public class BadThreads {

    static String message;

    private static class CorrectorThread
            extends Thread {

        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
            // Key statement 1:
            message = "Mares do eat oats.";
        }
    }

    public static void main(String args[])
            throws InterruptedException {

        for (int i=0; i<20; i++){
            (new CorrectorThread()).start();
            message = "Mares do not eat oats.";
            //Thread.sleep(2000);
            // Key statement 2:
            System.out.println(message);
        }

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        System.out.println("begin 1");
        new Thread(printInventory).start();
        System.out.println("begin 2");
        new Thread(printRecords).start();
        System.out.println("begin 3");
        new Thread(printInventory).start();
        System.out.println("end");

    }
}