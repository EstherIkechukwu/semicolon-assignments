import java.util.Scanner;

public class TriangleType{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
		if (side1 == side2 && side2 == side3){
			System.out.println("The triangle is Equilateral.");
            	} 
		else if (side1 == side2 || side1 == side3 || side2 == side3){
                	System.out.println("The triangle is Isosceles.");
            	} 
		else{
                	System.out.println("The triangle is Scalene.");
            	}
        } 
	else {
		System.out.println("The input does not form a triangle.");
        }
    }
}