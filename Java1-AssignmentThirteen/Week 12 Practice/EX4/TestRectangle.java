//Ryan Siegel - Java 1 - 12/8/21
public class TestRectangle
{
   public static void main(String[] args)
   {   
        //default
        Rectangle r1 = new Rectangle();
        System.out.println("The rectangle has a length of " + r1.getLength() + " and a width of " + r1.getWidth() +
                " and area of " + r1.getArea() + " and a perimeter of " + r1.getPerimeter());
        System.out.println("----------");          
        //give radius            
        Rectangle r2 = new Rectangle(1,2);
        System.out.println("The rectangle has a length of " + r2.getLength() + " and a width of " + r2.getWidth() +
                " and area of " + r2.getArea() + " and a perimeter of " + r2.getPerimeter());
        System.out.println("----------");
        //change defaults
        Rectangle r3 = new Rectangle();
        System.out.println("The rectangle has a length of " + r3.getLength() + " and a width of " + r3.getWidth() +
                " and area of " + r3.getArea() + " and a perimeter of " + r3.getPerimeter());
        r3.setLength(3.2f);r3.setWidth(4);
        System.out.println("The rectangle has a new length of " + r3.getLength() + " and a new width of " + r3.getWidth() +
                " and area of " + r3.getArea() + " and a perimeter of " + r3.getPerimeter());
        System.out.println("----------");
        //Test toString
        Rectangle r4 = new Rectangle(12,2.3f);
        System.out.println(r4.toString());
        System.out.println(r4);
        System.out.println("Operator '+' invokes toString() too: " + r4);
    }
}