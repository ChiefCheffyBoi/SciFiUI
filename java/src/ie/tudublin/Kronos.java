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
        ui.ellipse(x, y, radius, diameter);
        ui.fill(64,224,208);
        //praxis (kronos' moon)
        ui.ellipse(x-800, y, radius/5, diameter/5);
        ui.fill(60,60,60);
        // moon was destroyed, making destroyed pieces
        for(int i = 0; i < ui.random(1-20); i++)
        {
            ui.ellipse(ui.random(x-200, x-600), ui.random(400 , 600), ui.random(1 , 100), ui.random(1 , 100));
        }


    }
}