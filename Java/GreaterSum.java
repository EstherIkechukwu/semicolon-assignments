import java.util.Scanner;
public class GreaterSum{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Give a number: ");
	int firstNumber = input.nextInt();

	System.out.print("Give a number: ");
	int secondNumber = input.nextInt();

	System.out.print(firstNumber > secondNumber ? "Greater\n" : "lesser" ); 
		System.out.print("You are going well....");
		
	int sum = firstNumber + secondNumber;

	System.out.print(sum > 50 ? "even sum is greater" : "sum is lesser" );
