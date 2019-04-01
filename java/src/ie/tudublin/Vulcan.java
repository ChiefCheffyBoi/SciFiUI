package ie.tudublin;

public class Vulcan
{

    UI ui; 
    private float x;
    private float y;
    private float diameter;
    private float radius;



    public Vulcan(UI ui, float x, float y, float radius, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.radius = radius; 
    }

    public void render()
    {       
        //vulcan is an orange planet very similiar to mars, 2*radius of earth
        ui.ellipse(x, y, radius, diameter);
        ui.fill(253,94,83);
    }



}