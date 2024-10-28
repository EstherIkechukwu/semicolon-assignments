import java.util.Scanner;
public class TwoNumbersSum{
	public static void main(String [] args){
	Scanner input = new Scanner (System.in);

	int stop = -1;

	do{
		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();

		int sum = firstNumber + secondNumber;
		System.out.printf("The sum is %d%n" , sum);

		System.out.print("Do you want to perform the operation again?, if yes, enter -1. if No,enter any number: ");
		 stop = input.nextInt();

	}

		while(stop != -1);


	}
}