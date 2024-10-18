import java.util.Scanner;
public class BodyMassIndex{
	public static void main(String[]args){
	Scanner index = new Scanner(System.in);

	System.out.print("Enter weight in pounds: ");
	double weightInPounds = input.nextDouble();

	System.out.print("Enter height in inches: ");
	double heightInInches = input.nextDouble();

	double bodyMassIndex = (weightInPounds * 703) / heightInInches * heightInInches;
	System.out.printf( "the result is %f " , bodyMassindex);

	}
}