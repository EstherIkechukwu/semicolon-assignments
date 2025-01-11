import java.util.Scanner;
public class IncreasingDecreasing{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first number: ");
	int firstNumber = input.nextInt();
	System.out.print("Enter the second number: ");
	int secondNumber = input.nextInt();
	System.out.print("Enter the third number: ");
	int thirdNumber = input.nextInt();

		if(firstNumber > secondNumber && secondNumber > thirdNumber){
			System.out.print("they are in decreasing order");
		}
		else if(firstNumber < secondNumber && secondNumber < thirdNumber){
			System.out.print("they are in increasing order");
		}
		else{
			System.out.print("invalid input");
		}


	}


}