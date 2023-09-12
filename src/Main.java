import Semaphoren.Ozone;
import Semaphoren.SauerstoffGenerator;
import Semaphoren.WasserGenerator;
import Semaphoren.WasserstoffGenerator;
import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args){
        WasserstoffGenerator wsg = new WasserstoffGenerator(300);
        SauerstoffGenerator sg = new SauerstoffGenerator(300);
        WasserGenerator wg = new WasserGenerator(300);
        Ozone oz = new Ozone(300);
        sg.start();
        wsg.start();
        wg.start();
        oz.start();

PApplet.main(Main.class);

    }
    public void settings(){
        size(500,500);
    }
    public void draw(){
        background(0);
        text("Wasserstoff: " + WasserstoffGenerator.Number(),10,10);
        text("Sauerstoff: " + WasserstoffGenerator.Number(),10,10);
      //  text("Wasser: " + WasserGenerator.,10,10);
    }
}
