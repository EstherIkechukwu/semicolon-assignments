import java.util.Scanner;

public class ValidatingUserInput{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int sentinalValue = 2 ;
	int number;

		do{
			System.out.print("Give me a number: ");
			number = input.nextInt();

		}

		while(number != sentinalValue);






	}


}