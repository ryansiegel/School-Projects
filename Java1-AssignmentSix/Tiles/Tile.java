
/**
 * Write a description of class Tile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tile
{
    private String color;
    private int value;

    public Tile()
    {
        color = "NO COLOR";
        value = 0;
    }
    public Tile(String colorr, int valuee)
    {
        if (valuee >= 1 && valuee <= 13 && (colorr == "Green" || colorr == "Red" || colorr == "Blue" || colorr == "Yellow"))
        {value = valuee; 
        color = colorr;}
        else
        {value = 0;
        color = "NO COLOR";}
    }
    
	
    public String getColor()
    {   return color;   }
    public int getValue()
    {   return value;   }
    
	
    public void setColor(String colorr)
    {
        if (colorr == "Green" || colorr == "Red" || colorr == "Blue" || colorr == "Yellow") color = colorr;
    }
    public void setValue(int valuee)
    {   
        if (valuee >= 1 && valuee <= 13) value = valuee;
    }
    
	
    public void tradeTiles(String colorr, int valuee)
    {
        if (valuee >= 1 && valuee <= 13 && (colorr == "Green" || colorr == "Red" || colorr == "Blue" || colorr == "Yellow"))
        {value = valuee; 
        color = colorr;}
    }
    
	
    public String toString()
    {
        return color + " " + value;
    }
}