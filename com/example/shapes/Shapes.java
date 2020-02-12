package com.example.shapes;

import java.util.Scanner;

public class Shapes {
 int numberOfSides;
	
	
	 @SuppressWarnings("resource")
public	void calculateShapeArea( int numberOfSides) {
		 Scanner num = new Scanner(System.in);
		this.numberOfSides = numberOfSides;

		 if(this.numberOfSides==1) {
			 System.out.print(" Enter the Diameter of Circle : ");
			 float Diameter=num.nextInt();
			 
			 calculateArea(Diameter);
			 
		 }
		 
 if(this.numberOfSides==3) {
			 
		System.out.print(" Enter the base length of triangle : ");
		int base  = num.nextInt();
	
		System.out.print(" Enter the height of triangle : ");
		int height  = num.nextInt();
		
	 calculateArea(base , height);
			 
		 }
 
 
 if(this.numberOfSides==4) {
	 
		System.out.print(" SideLength of Square : ");
		int Length = num.nextInt();
	
		
	 calculateArea(Length);
			 
		 }
		 
		 
		 
		 
	}
	 
	
	 
	 void calculateArea(float Dia){
		 float diameter = Dia;
		 
		 double Area = 3.142*((diameter/2)*(diameter/2));
		 
		 System.out.println("Area of circle : "+Area);
		 
		 
	 }
	 
	 void calculateArea(int base ,int height){
		int b = base;
		int alt = height;
		 double Area = 0.5*b*alt;
		 
		 System.out.println("Area of triangle : "+Area);
		 
		 
	 }
	 
	 
	 void calculateArea(int length){
		int side = length;
		 
		 double Area = side*side;
		 
		 System.out.println("Area of square : "+Area);
		 
		 
	 }
	 

}
