package ie.tudublin;

import processing.core.PApplet;


public class Window extends PApplet
{

    UI ui; 
    private float x;
    private float y;
    private float diameter;
    private float radius; 


    public Window(UI ui, float x, float y, float radius, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.radius = radius; 
    }

    public void render()
    {
        ui.stroke(60,60,60);
        ui.ellipse(x, y, radius, diameter);
        ui.fill(60,60,60);
    }



}