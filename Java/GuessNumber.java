import java.util.Scanner;
public class GuessLoopsFor{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	
	
	int luckyNumber = (int)(Math.random() * 100); 
	int number = 0;

	while(number != luckyNumber){
		System.out.print("Give a number: ");
		number = input.nextInt();
			
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
}