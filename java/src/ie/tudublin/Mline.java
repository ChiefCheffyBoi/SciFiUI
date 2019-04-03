package ie.tudublin;

public class Mline
{

    UI ui; 

    public Mline()
    { 
        //want line to move in a clockwise direstion once. 
    }

    public void render()
    {       
     
    }
}
/*package ie.tudublin;

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
        // Static field
        ui.translate(pos.x, pos.y);
        ui.rotate(rotation);
        ui.line(x, y,xr, yr);
        

    }

    public void update()
    {       
        this.x=(int) Math.sin(rotation);
        this.y = (int) -(float) Math.cos(rotation);
        rotation += 0.1f;
    }
} 
*/