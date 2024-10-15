import java.util.Scanner;
public class IntegerBetween{
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 and 1000");
	int inBetween = input.nextInt();

	int digit1 = inBetween / 100;
	int number2 = inBetween / 10;
	int digit2 = number2 % 10;
	int digit3 = inBetween % 10;
	
	int sum = digit1 + digit2 + digit3;
	System.out.printf("Result of sum is %d" , sum);
			
}
}