package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar extends PApplet
{
    UI ui;
    private int x;
    private float dx = 1;
    private int y;
    private int diameter;
    private float radius;
    private float xr =0;
    private float yr = 0;

    private PVector pos;
    private float rotation;
    private float space = 30; 


    public Radar(UI ui, int x, int y, int diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = (diameter / 2) - 30;
        pos = new PVector(x, y);
        xr = x - radius-250;
        yr = y - radius-250;

    }
    
    public void render()
    {
        ui.stroke(0,255,50);
        ui.noFill();
        ui.ellipse(pos.x, pos.y, diameter, diameter);
        ui.ellipse(pos.x, pos.y, diameter-space, diameter-space);
        ui.ellipse(pos.x, pos.y, diameter-(space*2), diameter-(space*2));
        ui.ellipse(pos.x, pos.y, diameter-(space*3), diameter-(space*3));
        ui.fill(255);
        // Static field
        ui.translate(pos.x, pos.y);
        ui.rotate(rotation);
        ui.line(x, y,x+52,y+52);
    }

    public void update()
    {       
        this.x=(int) Math.sin(rotation);
        this.y = (int) -(float) Math.cos(rotation);
        rotation += 0.1f;
    }
} 