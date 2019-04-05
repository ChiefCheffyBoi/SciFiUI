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
        //see outline.jpg for understanding of how this works
        //for clouds 126, 48,31 
        for(int i = 0; i<50; i++)
        {
            ui.fill(255,255,255);
            ui.ellipse(ui.random(250,750), ui.random(50,460), radius, radius);
            ui.ellipse(ui.random(250,750), ui.random(50,460), radius, radius);
        }
        for(int i=0; i<10; i++){
            ui.fill(255,255,255);
            //lhs
            ui.ellipse(ui.random(140,250), ui.random(100,410), radius, radius);
            //rhs
            ui.ellipse(ui.random(750,850), ui.random(100,410), radius, radius); 
        }
        for(int i =0; i<2; i++){
            ui.fill(255,255,255);
            //lhs
            ui.ellipse(ui.random(190,220), ui.random(80,100), radius,radius);
            ui.ellipse(ui.random(790,820), ui.random(80,100), radius,radius);
            //rhs
            ui.ellipse(ui.random(190,220), ui.random(400,450), radius,radius);
            ui.ellipse(ui.random(790,820), ui.random(400,450), radius,radius);
        }
        for(int i =0; i<5; i++){
            ui.fill(255,255,255);
            //lhs
            ui.ellipse(ui.random(60,190),ui.random(170,360), radius, radius);
            //rhs
            ui.ellipse(ui.random(850,970),ui.random(170,360), radius, radius);
        }
        for(int i=0; i<3; i++){
            ui.fill(255,255,255);
            //lhs
            ui.ellipse(ui.random(109,160), ui.random(360,405), radius, radius);
            ui.ellipse(ui.random(109,160), ui.random(120,170), radius, radius);
            //rhs
            ui.ellipse(ui.random(850,910), ui.random(360,405), radius, radius);
            ui.ellipse(ui.random(850,910), ui.random(120,170), radius, radius);
        }
        for(int i =0; i<4; i++){
            ui.fill(255,255,255);
            //top
            ui.ellipse(ui.random(350,650), ui.random(25,50), radius, radius);
            //bottom
            ui.ellipse(ui.random(350,650), ui.random(460,485), radius, radius);
        }
    }
}