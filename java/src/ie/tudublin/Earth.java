package ie.tudublin;

public class Earth 
{

    UI ui; 
    private float x;
    private float y;
    private float diameter;
    private float radius;
    private float x1;
    private float y1;
    private float d1;
    private float r1; 
    private float numC;


    public Earth(UI ui, float x, float y, float radius, float diameter, float numC, float x1, float y1, float r1, float d1)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.radius = radius; 
        this.x1 = x1;
        this.y1 = y1;
        this.d1 = d1;
        this.r1 = r1; 
        this.numC = numC;
    }

    public void render()
    {
        ui.stroke(255,240,210);
        //earth
        ui.ellipse(x, y, radius, diameter);
        ui.fill(0,0,255);
        //contenents post C02 disaster
        ui.ellipse(x, y-100, 60, 90);
        ui.fill(0,255,0);
        

        //moon
        ui.ellipse(x/4, y, radius/4, radius/4);
        ui.fill(60,60,60);
        //details on moon
        for(int i=0; i< numC; i++)
        {
            ui.fill(80,80,80);
            ui.ellipse(x1, y1, r1, d1);
        }
        
    }



}