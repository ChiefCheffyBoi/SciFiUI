package ie.tudublin;

public class Stars
{

    UI ui; 
    private float radius;



    public Stars(UI ui, float radius)
    {
        this.ui = ui;
        this.radius = radius; 
    }

    public void render()
    {       
        //fake box in which random stars are made, towards the sides are placed stars to fit the window
        //Note to self: trying to fill a oval with square blocks is not fun...
        for(int i = 0; i<50; i++)
        {
            ui.fill(255,255,255);
            //lhs
            ui.ellipse(ui.random(250,750), ui.random(50,460), radius, radius);
            //rhs
            ui.ellipse(ui.random(250,750), ui.random(50,460), radius, radius);
        }
        for(int i=0; i<10;i++){
            ui.fill(255,255,255);
            //lhs
            ui.ellipse(ui.random(150,250), ui.random(100,410), radius, radius);
            //rhs
            ui.ellipse(ui.random(750,850), ui.random(100,410), radius, radius); 
        }
        for(int i =0; i<2;i++){
            ui.fill(255,255,255);
            //lhs
            ui.ellipse(ui.random(190,220), ui.random(80,100), radius,radius);
            ui.ellipse(ui.random(790,820), ui.random(80,100), radius,radius);
            //rhs
            ui.ellipse(ui.random(190,220), ui.random(400,450), radius,radius);
            ui.ellipse(ui.random(790,820), ui.random(400,450), radius,radius);
        }
        for(int i =0; i<5;i++){
            ui.fill(255,255,255);
            //lhs
            ui.ellipse(ui.random(70,190),ui.random(180,360), radius, radius);
            //rhs
            ui.ellipse(ui.random(850,970),ui.random(180,360), radius, radius);
             
        }
        
        
        
    }
}