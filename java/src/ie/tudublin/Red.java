package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Red extends PApplet
{
    UI ui;
    private int x;
    private int y;

    private PVector poss;
    private float rotation; 


    public Red(UI ui, int x, int y)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        poss = new PVector(x, y);
    }
    
    public void render()
    {
        ui.stroke(255,0,50);
        ui.noFill();
        ui.fill(255);
        // Static field
        ui.translate(poss.x, poss.y);
        ui.rotate(rotation);
        ui.line(x, y,x+100,y+100);
    }

    public void update()
    {       
        this.x=(int) Math.sin(rotation);
        this.y = (int) -(float) Math.cos(rotation);
        rotation += 0.1f;
    }
    
} 