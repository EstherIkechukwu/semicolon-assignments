import java.util.Scanner;
public class Guess{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int luckyNumber = 6;

	System.out.print("Give a number: ");
	int number = input.nextInt();

		if(number == luckyNumber){
			System.out.print("Congratulations! Correct guess\n");
		}
		else if(number > luckyNumber){
			System.out.print("too high, try again\n");
		}
		else if(number < luckyNumber){
			System.out.print("too low, try again\n");
		}





	}




}