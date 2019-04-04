package ie.tudublin;

public class Kronos
{

    UI ui; 
    private float x;
    private float y;
    private float diameter;
    private float radius;



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
        ui.ellipse(x-400,y-20,40,40);//
        ui.ellipse(x-350,y-100,50,50);//
        ui.ellipse(x-420,y,10,10);
        ui.ellipse(x-420,y,10,10);
        ui.ellipse(x-420,y,10,10);


    }
}