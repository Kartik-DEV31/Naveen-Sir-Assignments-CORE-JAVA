import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.shapes.Shapes;

public class AreaCalculator {

	public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	
	int sides = 0 ;
	System.out.print("Enter the number of Sides(Triangle , Square or Circle) : ");
	try
	{
	 sides = num.nextInt()    	;
	}
	
	catch(InputMismatchException e)
	{
		
		System.out.println("Wrong Input");
		
	}
	
	if (sides ==0) {System.out.println("Sides can't be zero");}
	Shapes obj = new Shapes();
	
	obj.calculateShapeArea(sides);
	
	}

}
