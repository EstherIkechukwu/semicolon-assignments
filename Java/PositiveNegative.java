import java.util.Scanner;

public class PositiveNegative{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	int positive = 0;
	int negative = 0;

	if(number > 0){
		System.out.print("number is positive");
	}
	else if(number < 0){
		System.out.print("number is negative");
	} 
	else if(number == 0){
		System.out.print("number is neutral"); 
	}
	

	}
}