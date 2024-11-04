import java.util.Scanner;
public class PalindromeFiveDigit{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


		System.out.print("Enter a five digit integer: ");
		String fiveDigits = input.nextLine();

		if(fiveDigits.length() == 5){
			int fiveDigit = Integer.valueOf(fiveDigits);

		int firstOne = fiveDigit / 10000;
		int secondNumber = fiveDigit / 1000;
		int secondDigit = secondNumber % 10;
		int thirdNumber = fiveDigit / 100;
		int thirdDigit = thirdNumber % 10;
		int fourthNumber = fiveDigit / 10;
		int fourthDigit = fourthNumber % 10;
		int fifthDigit = fiveDigit % 10;
		
		if(firstOne == fifthDigit){
			System.out.printf(" %d is a Palindrome" , fiveDigit);
		} 
		else {
			System.out.printf("%d is not a Palindrome" , fiveDigit);
		}
		else{
			System.out.println("number is not a five digit long");
		}



	


	}

}