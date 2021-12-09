//Ryan Siegel - Java 1 - 12/8/21
public class Rectangle
{
    private float length = 1.0f;
    private float width = 1.0f;
    
    public Rectangle()
    {
        //defaulting to 1 like above
        length = 1.0f;
        width = 1.0f;
    }
    
    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    
    public float getLength() {return length;}
    public float getWidth() {return width;}
    public void setLength(float length) {this.length = length;}
    public void setWidth(float width) {this.width = width;}
    
    public double getArea()
    {
        //area = length * width
        double area = length * width;
        return area;
    }
    
    public double getPerimeter()
    {
        //perimeter = 2 * (l + w)
        double perimeter = 2 * (length + width);
        return perimeter;
    }
    
    public String toString()
    {
        String phrase;
        phrase = "Rectangle[length=" + length + ",width=" + width + "]";
        return phrase;
    }
}
