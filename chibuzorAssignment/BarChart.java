import java.util.Scanner;

public class BarChart{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter 5 number: ");
	int firstNumber = input.nextInt();
	int secondNumber = input.nextInt();
	int thirdNumber = input.nextInt();
	int fourthNumber = input.nextInt();
	int fifthNumber = input.nextInt();

	int counterOne = 0;
	int counterTwo = 0;
	int counterThree = 0;
	int counterFour = 0;
	int counterFive = 0;

	if( firstNumber < 30 && secondNumber < 30 && thirdNumber < 30 && fourthNumber < 30 && fifthNumber < 30){
	while (counterOne < firstNumber){
		System.out.print("*");
		counterOne++

		System.out.print();
	}

	while (counterTwo < secondNumber){
		System.out.print("*")
		counterTwo++

		System.out.print();
	}

	while (counterThree < thirdNumber){
		System.out.print("*")
		counterThree++

		System.out.print();
	}

	while (counterFour < fourthNumber){
		System.out.print("*")
		counterFour++

		System.out.print();
	}

	while (counterFive < fifthNumber){
		System.out.print("*");
		counterFive++

		System.out.print();
	}







	}
	else{
	System.out.print("Not in range of 30");

	







	}
}