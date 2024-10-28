import java.util.Scanner;
public class FloatingPoint{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first floating point number: ");
	double firstNumber = input.nextDouble();

	System.out.print("Enter second floating point number: ");
	double secondNumber = input.nextDouble();

		if(firstNumber != secondNumber){
			System.out.print("They are different");
		}
		else if(firstNumber == secondNumber){
			System.out.print("They are the same");
		}


	

	}


}