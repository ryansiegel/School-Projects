//Ryan Siegel - Java 1 - 12/8/21
public class TestCircle
{
   public static void main(String[] args)
   {   
        //default
        Circle c1 = new Circle();
        System.out.println("The circle has a radius of " + c1.getRadius() + " and area of " +
                  c1.getArea() + " and a circumference of " + c1.getCircumference());
        System.out.println("----------");          
        //give radius            
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has a radius of " + c2.getRadius() + " and area of " +
                  c2.getArea() + " and a circumference of " + c2.getCircumference());
        System.out.println("----------");
        //change defaults
        Circle c3 = new Circle();
        System.out.println("The circle has a radius of " + c3.getRadius() + " and area of " +
                  c3.getArea() + " and a circumference of " + c3.getCircumference());
        c3.setRadius(3.0);
        System.out.println("The circle has a new radius of " + c3.getRadius() + " and area of " +
                  c3.getArea() + " and a circumference of " + c3.getCircumference());
        System.out.println("----------");
        //Test toString
        Circle c4 = new Circle(4.1);
        System.out.println(c4.toString());
        System.out.println(c4);
        System.out.println("Operator '+' invokes toString() too: " + c4);
    }
}