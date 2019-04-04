package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Window extends PApplet
{

    UI ui; 
    private float x;
    private float y;
    private float diameter;
    private float radius; 
    PImage screw;



    public Window(UI ui, float x, float y, float radius, float diameter, PImage screw)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.radius = radius; 
        this.screw = screw;
         
    }

    public void render()
    {
        ui.stroke(0,0,0);
        ui.fill(0,0,0);
        ui.ellipse(x, y, radius, diameter);

        ui.noFill();
        ui.ellipse(x, y, radius+20, diameter+20);

        ui.image(screw,250,500,20,20); 
        ui.image(screw,250,10,20,20); 
        ui.image(screw,774,500,20,20);
        ui.image(screw,774, 10, 20,20); 
        ui.image(screw,950,400,20,20);
        ui.image(screw,950, 100, 20,20); 
        ui.image(screw,60,400,20,20);
        ui.image(screw,60, 100, 20,20); 
        ui.image(screw, x, 525, 20,20); 
    }



}