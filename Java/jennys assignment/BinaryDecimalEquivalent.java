import java.util.Scanner;

public class BinaryDecimalEquivalent{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int power = 1;
	int remainder = 0;
	int decimalNumber = 0;
	
	System.out.print("Enter a binary number: ");
	int binary = input.nextInt();

		while(binary > 0){
			remainder = binary % 10;
			decimalNumber += remainder * power;
			power *= 2;
			binary = binary / 10;
		}
	System.out.print("Decimal number " + decimalNumber);	


	}


}