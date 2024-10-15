import java.util.Scanner;
public class Digits{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter five digits");
	int fiveDigit = input.nextInt();
	int firstOne = fiveDigit / 10000;

	int secondNumber = fiveDigit / 1000;
	int secondDigit = secondNumber % 10;
	int thirdNumber = fiveDigit / 100;
	int thirdDigit = thirdNumber % 10;
	int fourthNumber = fiveDigit / 10;
	int fourthDigit = fourthNumber % 10;
	int fifthDigit = fiveDigit % 10;

	System.out.println(firstOne +"   "+secondDigit+"   "+ thirdDigit +"   "+fourthDigit +"   "+fifthDigit);
	 

}
}