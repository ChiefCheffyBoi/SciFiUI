package ie.tudublin;

import processing.data.*;

public class Science
{
    private String name;
   

    public Science(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }

    public Science(TableRow tr)
    {
        // Constructor chaining
        this(tr.getString("Name"));
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }    
}