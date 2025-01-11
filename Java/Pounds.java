import java.util.Scanner;
public class Pounds{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pounds: ");
	double numberInPounds = input.nextDouble();

	double numberInKilograms = numberInPounds * 0.454;
	System.out.printf("The value in Kilogram is %f" , numberInKilograms);
 


	}

}