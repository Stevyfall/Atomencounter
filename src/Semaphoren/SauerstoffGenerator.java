package Semaphoren;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SauerstoffGenerator extends Thread {
    int maxAbstand;
    static int sauerstoff = 0;
    private static Semaphore semaphore = new Semaphore(3);


    public SauerstoffGenerator(int maxAbstand) {
        this.maxAbstand = maxAbstand;
    }

    public void run() {
        int abstand = (int) (Math.random()*maxAbstand) + 1000;
        try {
            semaphore.acquire();
            while (true) {

                System.out.println("Sauerstoffatome: " + sauerstoff);
                TimeUnit.SECONDS.sleep(1);
                Thread.sleep(1000);
                semaphore.release();
                sauerstoff++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static int number(){
        return sauerstoff;
    }

}
