package ie.tudublin;

import java.awt.Graphics;
import javax.swing.JPanel;
public class Kronos extends JPanel
{

    //for clouds 126, 48,31 
    UI ui;
    private float x;
    private float y;
    private float diameter;
    private float radius;
    Graphics g;



    public Kronos(UI ui, float x, float y, float radius, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.radius = radius; 
    }

    public void render()
    {       
        //kronos
        ui.fill(64,224,208);
        ui.ellipse(x, y, radius, diameter);
        //praxis (kronos' moon)
        ui.fill(60,60,60);
        ui.ellipse(x-450, y, radius/4, diameter/4);       
        // moon was destroyed, making destroyed pieces
        ui.fill(0,0,0);
        ui.ellipse(x-420,y-10,100,100);
        ui.fill(60,60,60);
        ui.ellipse(x-420,y,10,10);//
        ui.ellipse(x-400,y-20,30,30);//
        ui.ellipse(x-350,y-100,20,20);//
        ui.ellipse(x-360,y+20,10,10);//
        ui.ellipse(x-350,y-20,10,10);//
        ui.ellipse(x-410,y-50,10,10);//
        ui.ellipse(x-320,y,10,10);//
        ui.ellipse(x-320,y-80,10,10);//
        ui.ellipse(x-370,y-10,10,10);//
        //stormy boi
       /* int width = 20;
        int height = 20;
        int startAngle = 0;
        int arcAngle = 180;
        int depth = 10;
        int j =300;
        int k = 250;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                //   g.drawArc(x + 10, y + 10, width, height, startAngle + 10, -arcAngle);
                //  x = x - 5;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(j, k, width, height, startAngle, -arcAngle);
            } else {
                //  g.drawArc(x + 10, y + 10, width, height, startAngle + 10, arcAngle);
                x = x - 2 * depth;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(j, k, width, height, startAngle, arcAngle);
            }
        }
        */


    }
}