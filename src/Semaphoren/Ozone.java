package Semaphoren;

import java.util.concurrent.TimeUnit;

public class Ozone extends Thread{

    int maxAbstand;
    int ozon = 0;
   // SauerstoffGenerator sg = new SauerstoffGenerator(maxAbstand);
    public Ozone(int maxAbstand) {
        this.maxAbstand = maxAbstand;
    }

    public void run() {
        int abstand = (int) (Math.random()*maxAbstand) + 1000;

        try {
            while (ozon<100) {
                if(SauerstoffGenerator.number() >= 3) {
                    ozon++;
                    SauerstoffGenerator.sauerstoff-=3;
                }
                System.out.println("Ozon: " + ozon);
                TimeUnit.SECONDS.sleep(1);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
