//Ryan Siegel - Java 1 - 12/8/21
public class Circle
{
    private double radius = 1.0;
    
    public Circle()
    {
        //defaulting to 1 like above
        radius = 1.0;
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}
    
    public double getArea()
    {
        //area = pi * radius^2
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    
    public double getCircumference()
    {
        //cir = 2 * pi * radius
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
    
    public String toString()
    {
        String phrase;
        phrase = "Circle[radius=" + radius + "]";
        return phrase;
    }
}
