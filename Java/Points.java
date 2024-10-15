import java.util.Scanner;
public class Points{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first point");	
	double x1 = input.nextDouble();

	System.out.print("Enter second point");
	double y1 = input.nextDouble();

	System.out.print("Enter third point");
	double x2 = input.nextDouble();

	System.out.print("Enter fourth point");
	double y2 = input.nextDouble();

	System.out.print("Enter fifth point");
	double x3 = input.nextDouble();

	System.out.print("Enter sixth point");
	double y3 = input.nextDouble();

	double side1 = x1 + y1;
	double side2 = x2 + y2;
	double side3 = x3 + y3;

	double averageSide = (side1 + side2 + side3) / 3;
	System.out.printf("The result is %f" , averageSide);

	double area = averageSide * (averageSide - side1) * (averageSide - side2) * (averageSide - side3);
	System.out.printf("The area is %f" , area);

	double squareRootOfArea = Math.sqrt(area);
	System.out.printf("The Squareroot is %f" , squareRootOfArea);
}
}