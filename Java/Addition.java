import java.util.Scanner;
public class Addition{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	double secondNumber = input.nextDouble();

	System.out.print("Enter third number: ");
	float thirdNumber = input.nextFloat();

	double addition = firstNumber + secondNumber + thirdNumber;
	System.out.printf("The sum is %.2f" , addition);

	}
}
