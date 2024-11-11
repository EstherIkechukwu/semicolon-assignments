import java.util.Scanner;

public class SumOfEvenNumbers{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int sum = 0;

	System.out.print("Enter the first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter the second number: ");
	int secondNumber = input.nextInt();

	if(firstNumber < secondNumber){
		for(int number = firstNumber; number < secondNumber; number ++){

			if(number % 2 == 0){
				sum += number;
			}
		}
	System.out.print(sum);
	}



}
}
