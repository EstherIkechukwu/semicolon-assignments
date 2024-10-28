import java.util.Scanner;
public class LargestSmallest{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number:" );
	int first = input.nextInt();

	System.out.print("Enter second number: ");
	int second = input.nextInt();

	System.out.print("Enter third number: ");
	int third = input.nextInt();

	System.out.print("Enter fourth number: ");
	int fourth = input.nextInt();

	System.out.print("Enter fifth number: ");
	int fifth = input.nextInt();

	System.out.print("Enter sixth number: ");
	int sixth = input.nextInt();

	System.out.print("Enter seventh number: ");
	int seventh = input.nextInt();

	System.out.print("Enter eight number: ");
	int eight = input.nextInt();

	System.out.print("Enter ninth number: ");
	int ninth = input.nextInt();

	System.out.print("Enter tenth number: ");
	int tenth = input.nextInt();

	int sum = first + second + third + fourth + fifth + sixth + seventh + eight + ninth + tenth;
	System.out.printf("The sum is %d" , sum);

	}

}