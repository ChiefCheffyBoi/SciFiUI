package ie.tudublin;


public class Buttons {
    float x;
    float y;
    UI ui;
    Science sci; 
    int i; 
    


    public Buttons(UI ui, float x, float y, int i){
        this.x = x;
        this.y = y;
        //this.sci = sci; 
        this.i = i;
    }

    public void render(){
        /*
        ui.fill(0, 255, 80);
        ui.rect(x, y, buttonWidth, buttonHeight);
        ui.fill(255,0,0);
        ui.text(sci.getName(),  x + buttonWidth * 0.5f, y + buttonHeight * 0.5f);
        */
        ui.line(250, 500, 50, 50); 
    }
}