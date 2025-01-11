import java.util.Scanner;
public class GreatestNumber{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);	

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

	int greatest = firstNumber;

		if( firstNumber > secondNumber && firstNumber > thirdNumber){
			greatest = firstNumber; 
		}
		else if(secondNumber > thirdNumber && secondNumber > firstNumber){
			greatest = secondNumber; 
		}
		else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
			greatest = thirdNumber;
		}
			
		System.out.printf("The greatest number is %d" , greatest); 
	
	}
}