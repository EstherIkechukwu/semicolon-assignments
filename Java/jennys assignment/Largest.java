import java.util.Scanner;

public class Largest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Give a number: ");
	int number = input.nextInt();

	int largest = number;
	int counter = 1;

	while(counter < 10){
		System.out.print("Give a number: ");
		number = input.nextInt();

		if(number > largest){
			largest = number;
		}
	counter++;
	}
	System.out.print("The largest number is " + largest);

	}


}