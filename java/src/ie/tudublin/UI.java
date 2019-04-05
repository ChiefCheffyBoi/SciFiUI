package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Window w;
    YellowButtons yb; 
    ArrayList<Science> sciences = new ArrayList<Science>();
    Earth e;
    Vulcan v; 
    Kronos k; 
    Mline ml;
    Edetails ed;
    PImage screw;
    Stars s;

    int earth  = 0;
    int def    = 0;
    int vulcan = 0;
    int kronos = 0;
    int safe   = 0; 
    int red    = 0;
    int black  = 0;

    public void settings()
    {
        size(1024, 700);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen();  
    }
    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button"); 
        mc = new MovingCircle(this, width / 2, height / 2, 50);
     
        //paramaters for earth and moon
        e = new Earth(this, 600, 250, 400, 400);
        ed = new Edetails(this, 800,480, 200, 200);
        //vulcan
        v = new Vulcan(this, 500, 250, 800, 800);
        //kronos
        k = new Kronos(this, 590, 260, 480, 480);
        s = new Stars(this, 10);
        screw = loadImage("screw.jpg");
        w = new Window(this, 512, 260, 1000, 500, screw);
        
    }
    public void makeDecision( String speech){
        String[] array = speech.split(" ");
		// Find the key word to increment variable for thread below to understand which action to take. 
		if ("earth".equals(array[2])) {
			earth = 1; 
		} else if ("vulcan".equals(array[2])) {
			vulcan = 1;
		} else if ("Kronos".equals(array[2])) {
			kronos = 1;
		} else if ("red".equals(array[0])){
            red = 1; 
        }else if ("black".equals(array[0])){
            black = 1; 
        }else if ("shields".equals(array[0]) && "up".equals(array[1])){
            def = 1;
        }else if ("lower".equals(array[0]) && "shields".equals(array[1])){
            red = 1; 
        }else if ("cancel".equals(array[0])){
            red   = 0;
            black = 0;
        }
    }
    public void draw()
    {
             
        background(211,211,211);    
        w.render();
        s.render();
        earth =1;
        //kronos=1;
        //vulcan=1; 
    

        if(earth == 1){
            e.render();
            ed.render();
        }
        if(vulcan == 1){
            v.render();
        }
        if(kronos == 1){
            k.render();
        }
        if(red == 1){
            background(255,0,0);
        }
        if(black == 1){
            background(80,80,80);
        }
        if(def == 1){
            ml.render();
        }


    }
}

