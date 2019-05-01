package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;

import ddf.minim.*;

public class UI extends PApplet {

    ArrayList<Science> sciences = new ArrayList<Science>();
    MovingCircle mc;
    Window w;
    Earth e;
    Vulcan v;
    Kronos k;
    Mline ml;
    Edetails ed;
    PImage screw;
    Stars s;
    Minim minim;
    Radar r;
    Red re;
    Buttons bResult; 
    AudioPlayer player;
    AudioPlayer player2;
    AudioPlayer player3;
    AudioPlayer player4;
    AudioPlayer player5;
    AudioPlayer player6;

    int earth = 0;
    int def = 0;
    int vulcan = 0;
    int kronos = 0;
    int safe = 0;
    int red = 0;
    int black = 0;
    int result; 
    
    void loadProducts()
    {
        Table table = loadTable("Science.csv", "header");
        for(TableRow tr:table.rows())
        {
            Science sci = new Science(tr);
            sciences.add(sci);
        }        
    }


    public void settings() {
        size(1024, 700);
    }

    public void setup() {
        minim = new Minim(this);

        player = minim.loadFile("lobby.mp3");
        player2 = minim.loadFile("red.mp3");
        player3 = minim.loadFile("earth.mp3");
        player4 = minim.loadFile("black.mp3");
        player5 = minim.loadFile("vulcan.mp3");
        player6 = minim.loadFile("bkronos.mp3");
        

        mc = new MovingCircle(this, width / 2, height / 2, 50);

        // paramaters for earth and moon
        e = new Earth(this, 600, 250, 400, 400);
        ed = new Edetails(this, 800, 480, 200, 200);
        // vulcan
        v = new Vulcan(this, 500, 260, 460, 460);
        // kronos
        k = new Kronos(this, 590, 260, 480, 480);
        s = new Stars(this, 10);
        screw = loadImage("screw.jpg");
        w = new Window(this, 512, 260, 1000, 500, screw);
        r = new Radar(this, 650, 600, 150);
        re = new Red(this, 512, 260);

      
       
    }
    public void mouseClicked()
    {
        // My way lol
        if (mouseX > 20 && mouseX < 170)
        {
            if (mouseY < 520 && mouseY > 550)
            {
                red = 1; 
            }
        }
        if (mouseX > 20 && mouseX < 170)
        {
            if (mouseY < 550 && mouseY > 570)
            {
                black = 1; 
            }
        }


        if (mouseX > 20 && mouseX < 170)
        {
            if (mouseY < 520 && mouseY > 550)
            {
                red = 1; 
            }
        }
        if (mouseX > 20 && mouseX < 170)
        {
            if (mouseY < 520 && mouseY > 550)
            {
                red = 1; 
            }
        }
        if (mouseX > 20 && mouseX < 170)
        {
            if (mouseY < 520 && mouseY > 550)
            {
                red = 1; 
            }
        }
        if (mouseX > 20 && mouseX < 170)
        {
            if (mouseY < 520 && mouseY > 550)
            {
                red = 1; 
            }
        }
   
    
    }
    public void bg(){
            mouseClicked();
            w.render();
            s.render();
            buttons();
    }
    public void buttons(){
        mouseClicked();

        fill(255, 0,0);
        rect(20,520, 150,20);
        fill(0,0,0);
        text("Red Alert", 20+55, 520+15); 

        fill(255, 0,0);
        rect(20,550, 150,20);
        fill(0,0,0);
        text("Black Alert", 20+55, 550+15); 



    }
  
    public void draw()
    {
        background(160,160,160);
        mouseClicked();

        bg();
        
        earth =1;
        player.play();

        if(earth == 1){
            bg();
            e.render();
            ed.render();
            player.pause();
            player6.pause();
            player5.pause();
            player3.play();
            
        }
        if(vulcan == 1){
            bg();
            v.render();
            player.pause();
            player3.pause();
            player5.play();
            player6.pause();
        }
        if(kronos == 1){
            bg();
            k.render();
            player6.play();
            player.pause();
            player3.pause();
            player5.pause();
           
        }
        if(red == 1){
            re.render();
            re.update();
            player.pause();
            player2.play();
        }
        if(black == 1){
            background(80,80,80);
            bg();
            player4.play();
            player.pause();

        }
        r.render();
        r.update();
    }

}

