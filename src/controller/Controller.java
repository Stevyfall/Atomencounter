package controller;

public class Controller {
    private IView Iv;

    public Controller(IView Iv){
        this.Iv=Iv;
    }
    public void nextframe(){
        Iv.draw();

    }

}
