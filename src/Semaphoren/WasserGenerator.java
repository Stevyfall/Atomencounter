package Semaphoren;

public class WasserGenerator extends Thread{
    int maxAbstand;
    int wasser = 0;

  //  WasserstoffGenerator wg = new WasserstoffGenerator(maxAbstand);
  //  SauerstoffGenerator sg = new SauerstoffGenerator(maxAbstand);

    public WasserGenerator(int maxAbstand) {
        this.maxAbstand = maxAbstand;
    }

    public void run() {
        int abstand = (int) (Math.random()*maxAbstand) + 1000;

        try {
            while (wasser<100) {
                if(WasserstoffGenerator.Number() >= 2 && SauerstoffGenerator.number() >= 1) {
                    wasser++;
                    WasserstoffGenerator.wasserstoff-=2;
                    SauerstoffGenerator.sauerstoff--;
                }
                System.out.println("Wassermolekuehle: " + wasser);

                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    //public static int Number(){
   //     return wasser;
   // }
}
