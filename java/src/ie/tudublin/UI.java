package ie.tudublin;

import processing.core.PApplet;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Window w;
    YellowButtons yb; 
    ArrayList<Science> sciences = new ArrayList<Science>();

    boolean[] keys = new boolean[1024]; 

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(1024, 700);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen();
        loadText();    
    }
    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        w = new Window(this, 512, 250, 1000, 500);
    }
    void loadText()
    {
        Table table = loadTable("Science.csv", "header");
        for(TableRow tr:table.rows())
        {
            Science p = new Science(tr);
            sciences.add(p);
        }        
    }
    public void draw()
    {
        background(255);    
        w.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

