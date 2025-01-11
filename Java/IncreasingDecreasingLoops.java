import java.util.Scanner;
public class IncreasingDecreasingLoops{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	

	int stop = -1;

		do{
			System.out.print("Enter the first number: ");
			int firstNumber = input.nextInt();
			System.out.print("Enter the second number: ");
			int secondNumber = input.nextInt();
			System.out.print("Enter the third number: ");
			int thirdNumber = input.nextInt();

			if(firstNumber > secondNumber && secondNumber > thirdNumber){
				System.out.print("they are in decreasing order\n");
			}
			else if(firstNumber < secondNumber && secondNumber < thirdNumber){
				System.out.print("they are in increasing order\n");
			}
			else{
				System.out.print("invalid input\n");
			}
		System.out.print("Do you want to stop the operation ?, if yes, enter -1. if No,enter any number: ");
		stop = input.nextInt();
		}

		while(stop != -1);


	}
}