import java.util.Scanner;
public class Bmi{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds: ");
	double weightInPounds = input.nextDouble();

	System.out.print("Enter height in inches: ");
	double heightInInches = input.nextDouble();

	double weightInKilograms = weightInPounds * 0.45359237;
	double heightInMeters =  heightInInches * 0.0254;

	double bodyMassIndex = weightInKilograms / heightInMeters * heightInMeters;
	System.out.printf("The Body mass index is %f" , bodyMassIndex);


}

}