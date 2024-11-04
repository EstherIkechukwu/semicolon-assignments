import java.util.Scanner;

public class LimitCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the account number: ");
	int accountNumber = input.nextInt();

	System.out.print("Enter a new balance: ");
	int balance = input.nextInt();

	System.out.print("Enter the total of all items charged: ");
	int items = input.nextInt();

	System.out.print("Enter the allowed credit limit: ");
	int credit = input.nextInt();

	System.out.print("Enter the total of all creits applied: ");
	int totalCredit = input.nextInt();

	int newBalance = balance + items - totalCredit;
	if(totalCredit > credit ){
		System.out.println("exceeded credit limit");
	}
	System.out.print("the new balance is " + newBalance);


	}



}