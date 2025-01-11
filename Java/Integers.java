import java.util.Scanner;
public class Integers{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int firstNumber = input.nextInt();
	
	int firstDigit = firstNumber % 10;
	int firstNumberDigit = firstNumber % 100;

	System.out.print("Enter a number: ");
	int secondNumber = input.nextInt();

	int secondDigit = secondNumber % 10;
	int secondNumberDigit = secondNumber % 100;

	System.out.print("Enter a number: ");
	int thirdNumber = input.nextInt();

	int thirdDigit = thirdNumber % 10;
	int thirdNumberDigit = thirdNumber % 100;


		if(firstDigit == secondDigit){
			System.out.print("true");
		}
		else if(secondDigit == thirdDigit){
			System.out.print("true");
		}
		else if(thirdDigit == firstDigit){
			System.out.print("true");
		}
		else{
			System.out.print("false");

	}
}

}


