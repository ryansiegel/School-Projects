/*------------------------------------------------------------------------------------------------------
 * TileDriver.java
 * 		This is a driver program for the Tile class that students create
 *
 * NOTES TO STUDENTS:
 * 
 * 	Save this program in the same location as your Tile class
 * 	Compile your Tile class.  Compile this driver program.
 * 	Run the driver program to test your class.
 *
 *  DO NOT CHANGE THIS CODE.  ALL ERRORS WILL BE DUE TO YOUR CODE IN Tile.java
 * ----------------------------------------------------------------------------------------------------*/


import java.util.Scanner;
import java.util.Calendar;

public class TileDriver
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);

		//-----------------------------------------------------------------------------------------------
		// TESTING CONSTRUCTORS
		//
		// New objects are instantiated using the Tile class
		// Both constructors are used to test the two constructors 
		//
		//   tileSample1 is a valid Tile object which used the default constructors
		//   tileSample2 is a valid Tile object which used the 2-parameter constructor
		//   tileSample3 has an invalid color.  This tests the constructor validation
		//   tileSample4 has an invalid value.  This tests the constructor validation
		//   tileSample5 has an invalid value.  This tests the constructor validation
		//   
		//-----------------------------------------------------------------------------------------------

		Tile tileSample1 = new Tile ();
		Tile tileSample2 = new Tile ("Red", 5);
		Tile tileSample3 = new Tile ("Purple", 8);
		Tile tileSample4 = new Tile ("Blue", 15);
		Tile tileSample5 = new Tile ("Yellow", 14);
		
		//-----------------------------------------------------------------------------------------------
		//  Results of instantiation is displayed
		//-----------------------------------------------------------------------------------------------
		
		System.out.println("\n\nWelcome to the Tile Driver\n");
		System.out.println("-----------------   Testing Constructors   -------------------\n");
		System.out.println("Tile 1: Default Constructor: \t\t\t\t\t\t" + tileSample1.toString());
		System.out.println("Tile 2: Valid Parameters:\t\t\t\t\t\t\t" + tileSample2);
		System.out.println("Tile 3: Invalid color - Tile set to default values: \t\t" + tileSample3);
		System.out.println("Tile 4: Invalid value - Tile set to default values: \t\t" + tileSample4);
		System.out.println("Tile 5: Invalid value - Tile set to default values: \t\t" + tileSample5 + "\n\n");
		
		//-----------------------------------------------------------------------------------------------
		//  TESTING tradeTiles()
		//
		//  Tiles 1-5 are set to valid values using the tradeTiles() method - Results are displayed 
		//
		//	Tiles 3-5 are then attempted to be set to invalid values using tradeTiles() - results are displayed

		//-----------------------------------------------------------------------------------------------

		tileSample1.tradeTiles("Blue",12);
		tileSample2.tradeTiles("Red",7);
		tileSample3.tradeTiles("Yellow",1);
		tileSample4.tradeTiles("Green",10);
		tileSample5.tradeTiles("Blue", 13);	
		
		System.out.println("------------- Testing tradeTiles method with valid trades ------------------\n");
		System.out.println("Tile 1: valid trade:\t\t" + tileSample1.toString());
		System.out.println("Tile 2: valid trade:\t\t" + tileSample2);
		System.out.println("Tile 3: valid trade:\t\t" + tileSample3);
		System.out.println("Tile 4: valid trade:\t\t" + tileSample4);
		System.out.println("Tile 5: valid trade:\t\t" + tileSample5 + "\n\n");		
		
		
		
		tileSample3.tradeTiles("Yellow",14);
		tileSample4.tradeTiles("Purple",1);
		tileSample5.tradeTiles("Blue", 20);
		
		System.out.println("------------- Testing tradeTiles method with invalid trades ------------------\n");
		System.out.println("Tile 3: Invalid value (still Yellow 1): \t\t" + tileSample3);
		System.out.println("Tile 4: Invalid color (still Green 10):\t\t" + tileSample4);
		System.out.println("Tile 5: Invalid value (still Blue 13): \t\t" + tileSample5 + "\n\n");


		//-----------------------------------------------------------------------------------------------
		//  TESTING mutators
		//
		//  Tiles 1 -2 are invalid changes.
		//  Tiles 3-5 are valid changes.
		//-----------------------------------------------------------------------------------------------

		
		tileSample1.setColor("Orange");
		tileSample2.setValue(20);
		tileSample3.setValue(4);
		tileSample4.setColor("Red");
		tileSample5.setValue(8);
		
		System.out.println("------------------   Testing mutators   ------------------\n");
		System.out.println("Tile 1: Invalid color still Blue 12:\t\t" + tileSample1.toString());
		System.out.println("Tile 2: Invalid value still Red 7:\t\t" + tileSample2);
		System.out.println("Tile 3: Valid value now Yellow 4: \t\t" + tileSample3);
		System.out.println("Tile 4: Valid color now Red 10: \t\t\t" + tileSample4);
		System.out.println("Tile 5: Valid value now Blue 8: \t\t\t" + tileSample5 + "\n\n");
	
		//-----------------------------------------------------------------------------------------------
		//  TESTING accessors
		//
		//	tileSample1		displaying color and value using the accessors	
		//-----------------------------------------------------------------------------------------------
	
		System.out.println("-----------------  Testing accessors  --------------------\n");
		System.out.println("Tile 1 Color (Blue):\t" + tileSample1.getColor());
		System.out.println("Tile 1 Value (12):\t\t" + tileSample1.getValue() + "\n\n");
	
	}
}