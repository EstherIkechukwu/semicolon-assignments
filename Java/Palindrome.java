import java.util.Scanner;

public class Palindrome{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three digit integer: ");
		int number1 = input.nextInt();
		int digit1 = number1 / 100;
		int number2 = number1 / 10;
		int digit2 = number2 % 10;
		int digit3 = number1 % 10;

		if(digit1 == digit3){
			System.out.printf(" %d is a Palindrome" , number1);
		} 
		else {
			System.out.printf("%d is not a Palindrome" , number1);
		}
	
	}

}