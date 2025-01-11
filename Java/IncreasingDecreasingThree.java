import java.util.Scanner;
public class IncreasingDecreasingThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	

	int counter = 1;

		while(counter <= 3){
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
		counter++;
		}

	}

}		
