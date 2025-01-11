import java.util.Scanner;
public class Numbers{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number");
	int first = input.nextInt();
	System.out.print("Enter second number");
	int second = input.nextInt();

	System.out.print("Enter third number");
	int third = input.nextInt();

	System.out.print("Enter fourth number");
	int fourth = input.nextInt();

	System.out.print("Enter fifth number");
	int fifth = input.nextInt();

	int positive = 0;
	int negative = 0;
	int zero = 0;

	if (first > 0) positive++;
	if (second > 0) positive++;
	if (third > 0) positive++;
	if (fourth > 0) positive++;
	if (fifth > 0) positive++;

	if (first < 0) negative++;
	if (second < 0) negative++;
	if (third < 0) negative++;
	if (fourth < 0) negative++;
	if (fifth < 0) negative++;

	if (second == 0) zero++;
	if (first == 0) zero++;
	if (third == 0) zero++;
	if (fourth == 0) zero++;
	if (fifth == 0) zero++;

	System.out.println("The number of positive number: " + positive);
	System.out.println("The number of negative number: " + negative);
	System.out.println("The number of zero numbers: " + zero);

	}
}