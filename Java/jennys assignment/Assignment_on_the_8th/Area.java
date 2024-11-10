import java.util.Scanner;

public class Area{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the type of shape: please press:\n1. Circle\n2. Rectangle\n3. Triangle");
	int selection = input.nextInt();

	switch(selection){
	case 1:

	System.out.println("Do you want to calculate the area of a circle ?\n1. Yes\n2. No);
	int options = input.nextInt();

		switch(options){

			case 1:
			System.out.print("Enter the radius of the circle: ");
			int radius = input.nextInt();
			double pi = 3.142;
			double areaOfCircle = pi * radius * radius;
			System.out.print("The area of the circle is " , + areaOfCircle);
			break;

			case 2:
			System.out.print("Oops! I can't help you");
			

	case 2:

	System.out.println("Do you want to calculate the area of a rectangle?\n1. Yes\n2. No);
	int optionsRectangle = input.nextInt();

		switch(optionsRectangle){

			case 1:
			System.out.print("Enter the length of the Rectangle: ");
			int length = input.nextInt();
			System.out.println("Enter the breadth of the Rectangle: ");
			int breadth = input.nextInt();
			double areaOfRectangle = 0.5 * length * breadth;
			System.out.print("The area of the Rectangle is " , + areaOfRectangle);
			break;

			case 2:
			System.out.print("Oops! I can't help you");

	case 3:

	System.out.println("Do you want to calculate the area of a Triangle?\n1. Yes\n2. No);
	int optionsTriangle = input.nextInt();

		switch(optionsTriangle){

			case 1:
			System.out.print("Enter the height of the triangle: ");
			int height = input.nextInt();
			System.out.println("Enter the breadth of the triangle: ");
			int breadthTriangle = input.nextInt();
			double areaOfTriangle = 0.5 * height * breadthTriangle;
			System.out.print("The area of the Triangle is " , + areaOfTriangle);
			break;

			case 2:
			System.out.print("Oops! I can't help you");
			

			
	}
}
		
	

