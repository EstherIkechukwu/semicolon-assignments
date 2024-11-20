import java.util.Scanner;

public class SquareOfNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int counter = 1;

	while(counter <= 5) {
		System.out.print("Enter a number from 1 to 5: ");
			int number = input.nextInt();
			int numberSquared = number * number;
				
		System.out.println("The numbers squared is " + numberSquared);
		counter++;
		}
	}
	
}
	