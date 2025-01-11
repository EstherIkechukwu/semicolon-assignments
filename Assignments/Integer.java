import java.util.Scanner;
public class Integer{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter first Number: ");
	int firstInteger = input.nextInt();

	System.out.println("Enter second Number");
	int secondInteger = input.nextInt();

	int  tripledFirstInteger = firstInteger * 3;
	int doubledSecondInteger = secondInteger * 2;

	if(tripledFirstInteger % doubledSecondInteger == 0){
	System.out.println("The first number tripled is a multiple of second number doubled");
	}

	if (tripledFirstInteger % doubledSecondInteger != 0){
	System.out.println("The first number tripled is not a  multiple of second number doubled");
		}


}

}