import java.util.Scanner;
public class RandomNumber{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int guess = 0;
	int luckyNumber = (int) Math.random() * 10;

		while (guess != luckyNumber){
			System.out.print("Enter a number: ");
			guess = input.nextInt();
			
			if(guess > luckyNumber){
				System.out.print("Too high, try again");
			} 
			else if(guess < luckyNumber){
				System.out.print("Too low, try again");
			}
			else if(guess == luckyNumber){
				System.out.print("you won");
			} 
		}

	}

}