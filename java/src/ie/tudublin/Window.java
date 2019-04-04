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

        ui.fill(255,255,255);
        ui.ellipse(x, y, radius+20, diameter+20);

        ui.fill(0,0,0);
        ui.ellipse(x, y, radius, diameter);

        

        ui.fill(0,0,0);
        ui.ellipse(250,500,10,10); 
        ui.ellipse(250,10,10,10); 
        ui.ellipse(774,500,10,10);
        ui.ellipse(774, 10, 10,10); 
        ui.ellipse(950,405,10,10);
        ui.ellipse(950, 100, 10,10); 
        ui.ellipse(60,400,10,10);
        ui.ellipse(60, 100, 10,10); 
        ui.ellipse( x, 530, 10,10); 
    }



}