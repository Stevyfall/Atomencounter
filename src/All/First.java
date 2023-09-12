package All;

import processing.core.PApplet;
import processing.core.PImage;

public class First extends PApplet {
    public static void main(String[] args) {
        PApplet.main(First.class);
    }

    PImage[] gen1;
    int size = 100;
   final int NumberOfThread = 25;

    @Override
    public void settings() {
        size(1500, 1100);
    }

    @Override
    public void setup() {
        gen1 = new PImage[151];
        NumberThread[] t = new NumberThread[NumberOfThread];
        int EndIndex = 6;
        for(int i=0; i<NumberOfThread; i++) {
            if(i==6) EndIndex = EndIndex+1;
            t[i] = new NumberThread(i*6 ,(i*6)+EndIndex );
            t[i].start();
        }
        System.out.println("Done");
    }
    class NumberThread extends Thread{
        public int StartIndex;
        public int EndIndex;
        public NumberThread(int StartIndex, int EndIndex) {
            this.StartIndex = StartIndex;
            this.EndIndex = EndIndex;
           }

        @Override
        public void run () {
          //  System.out.println("jj");
            //for (int i = StartIndex; i <= EndIndex; i++) {
            while(StartIndex<EndIndex){
                String p = String.format("https://assets.pokemon.com/assets/cms2/img/pokedex/full/%03d.png" , StartIndex+1);
                gen1[StartIndex] = loadImage(p);
                System.out.println("Loaded: " + StartIndex);
                StartIndex++;
            }


        }
    }

    @Override
    public void draw() {
        background(0);
        for(int i=0; i<gen1.length; i++) {
            int xPos = (int) (i % 15) * size;
            int yPos = (int) (i / 15) * size;
            fill(255);
            text("+", xPos+size/2, yPos+size/2);

            if (gen1[i] != null) {
                image(gen1[i], xPos, yPos, size, size);
            }
        }
    }
    }


