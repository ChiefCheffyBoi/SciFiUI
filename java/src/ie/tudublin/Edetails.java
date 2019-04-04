package ie.tudublin;

public class Edetails
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    

    public Edetails(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
    }

    public void render()
    {
        ui.fill(58,134,183);
        ui.rect(x, y, width, height);
    }
}