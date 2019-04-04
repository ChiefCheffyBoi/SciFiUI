package ie.tudublin;

import javax.security.auth.callback.LanguageCallback;

public class Edetails
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String species = "Species : Human";
    private String planet = "Planet : MClass/Earth";
    private String language = "Native language: English";
    private String loyalty = "Loyalty : StarFleet";
    private String threat = "Threat level: high";
    private String population = "Population: 12.5billion";
    private String capital = "Capital: Dublin";
    private String surface = "Surface area: 1.96m miles";
    private String image = "Earth suffered drastic lanscape \n reform after Co2 disaster";


    

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

        ui.fill(0,0,0);
        ui.text(species, x+10, y+12);
        ui.text(planet, x+10, y+26);
        ui.text(threat, x+10, y+40);
        ui.text(language, x+10, y+54);
        ui.text(population, x+10, y+68);
        ui.text(loyalty, x+10, y+82);
        ui.text(capital, x+10, y+96);
        ui.text(surface, x+10, y+110);
        ui.text(image, x+10, y+126);
    }
}