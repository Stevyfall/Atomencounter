package Semaphoren;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class WasserstoffGenerator  extends  Thread{
    Random rand = new Random();
    static int wasserstoff = 0;
    int Abstand ;
    Semaphore semaphore= new Semaphore(2);
    public WasserstoffGenerator(int Abstand){
//this.semaphore =new Semaphore(1);
this.Abstand=Abstand;
    }
    public void run() {
        try {
            semaphore.acquire(1);
              while (true) {
                  System.out.println("Wasserstoff Atom Nr: " + wasserstoff);
               //   draw();
             // Wasserstoff wss = new Wasserstoff(rand.nextInt(255),30,30);
                //  wss.draw();
           //   wss.draw();
            //  wss.randomPos();
                TimeUnit.SECONDS.sleep(1);
                Thread.sleep(1000);
                semaphore.release(1);
                wasserstoff++;

            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static int Number(){
        return wasserstoff;
    }
   /* class Wasserstoff extends PApplet{
        Random rand = new Random();
        int xspeed = 5;
        int yspeed = 5;
        int fillColor;
        int widthBound, heightBound;
        int x = rand.nextInt(500);
        int y = rand.nextInt(500);

        public Wasserstoff(int fillColor, int widthBound, int heightBound) {
            this.fillColor = fillColor;
            this.widthBound = widthBound;
            this.heightBound = heightBound;
            this.randomPos();

        }

        void randomPos() {
            this.x = x + xspeed;
            if (x > widthBound || x < 0) {
                xspeed *= -1;
            }
            this.y = y + yspeed;
            if (y > heightBound || y < 0) {
                yspeed *= -1;
            }
        }

        void draw(PGraphics g) {
            g.fill(this.fillColor);
            g.ellipse(this.x, this.y, 20, 20);
        }

    }*/

}

