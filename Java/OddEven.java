import java.util.Scanner;
public class OddEven{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

		if (number % 2 == 0){
		System.out.print("Number is an even number");
		}
		else{
		System.out.print("Number is an odd number");
		}

	}

}