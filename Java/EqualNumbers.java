import java.util.Scanner;
public class EqualNumbers{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();
	
	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

		if(firstNumber == secondNumber && firstNumber == thirdNumber){
			System.out.print("they are equal");
		}
		else{
			System.out.print("they are not equal");
		}



	}

}