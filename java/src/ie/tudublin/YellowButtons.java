package ie.tudublin;

public class YellowButtons
{
    UI ui; 
    private float width;
    private float height;; 
    private float x;
    private float y;
    private String words; 

    public YellowButtons(UI ui, float x, float y, float height, float width, String words)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.words = words;
    }
    public void render()
    {
        ui.fill(0);
        ui.stroke(60,60,60);
        ui.rect(x, y, width, height);
        ui.textAlign(UI.CENTER, UI.CENTER);
        ui.text(words, x + width * 0.5f, y + height * 0.5f);
    }
}