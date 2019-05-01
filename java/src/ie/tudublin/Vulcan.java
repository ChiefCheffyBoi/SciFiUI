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
        ui.fill(253,94,83);
        ui.ellipse(x, y, radius, diameter);

        ui.fill(250, 90, 80);
        ui.ellipse(x+60, y-180, 50, 50);

        ui.fill(250, 90, 80);
        ui.ellipse(x-150, y+100, 100, 100);

        ui.fill(250, 90, 80);
        ui.ellipse(x+90, y+150, 100, 100);
        
        ui.fill(60,60,60);
        ui.ellipse(x+400, y-60, 80, 80);

        ui.fill(60,60,60);
        ui.ellipse(x-400, y+60, 40, 40);
        
        
    }
}