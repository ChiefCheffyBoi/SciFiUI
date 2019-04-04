package ie.tudublin;

public class Earth 
{

    UI ui; 
    private float x;
    private float y;
    private float diameter;
    private float radius;



    public Earth(UI ui, float x, float y, float radius, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.radius = radius; 
    }

    public void render()
    {
        
        ui.stroke(0);

        //earth
        ui.fill(0,0,255);
        ui.ellipse(x, y, radius, diameter);
        //contenents post C02 disaster
        ui.fill(0,255,0);
        ui.ellipse(x, y-80, 200,60);
        ui.ellipse(x-80, y-120, 18,30);
        ui.ellipse(x-100, y-120, 10,10);
        ui.ellipse(x, y+60, 140 ,200);
        ui.ellipse(x-160, y, 80 ,220);
        ui.ellipse(x+120, y-60, 120 ,170);

        //poles
        ui.fill(255,255,255);
        ui.ellipse(x, y-190,100,20);
        ui.ellipse(x, y+190,120,20);

        
        //moon
        ui.fill(80,80,80);
        ui.ellipse(x-400, y, radius/4, radius/4);
        //moon details
        ui.fill(90,90,90);
        ui.ellipse(x-390, y+20, radius/16, radius/16);
        ui.ellipse(x-420, y-30, radius/20, radius/20);
        ui.ellipse(x-370, y-10, radius/24, radius/24);

        ui.fill(0,0,0);
        
       
        
        
    }



}