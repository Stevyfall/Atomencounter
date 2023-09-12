package View;

import controller.IView;
import processing.core.PApplet;

import java.util.Random;

public class View extends PApplet implements IView {
    Random rand = new Random();
    public View() {setSize(300,300);

    }
    public void draw() {

        super.background(255);
        super.fill(0);
       super.text("Counter",100,50);
        super.fill(125);
        super.ellipse(rand.nextInt(300), rand.nextInt(super.height), 20, 20);
    }
    public static void main(String[] args){
        PApplet.main(View.class);
    }
}
