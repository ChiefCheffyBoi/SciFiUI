package ie.tudublin;

public class Stars
{

    UI ui; 
    private float x;
    private float y;
    private float diameter;
    private float radius;



    public Stars(UI ui, float x, float y, float radius, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.radius = radius; 
    }

    public void render()
    {       
        //fake box in which random stars are made, towards the sides are placed stars to fit the window 
        ui.ellipse(random(), y, radius, diameter);
        ui.fill(253,94,83);
    }
}