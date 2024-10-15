import java.util.Scanner;
public class Sum{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter 1: ");
	int numberOne = input.nextInt();

	System.out.print("Enter 2: ");
	int numberTwo = input.nextInt();

	System.out.print("Enter 3: ");
	int numberThree = input.nextInt();

	System.out.print("Enter 4: ");
	int numberFour = input.nextInt();

	System.out.print("Enter 5: ");
	int numberFive = input.nextInt();

	System.out.print("Enter 6: ");
	int numberSix = input.nextInt();

	System.out.print("Enter 7: ");
	int numberSeven = input.nextInt();

	System.out.print("Enter 8: ");
	int numberEight = input.nextInt();

	System.out.print("Enter 9: ");
	int numberNine = input.nextInt();

	System.out.print("Enter 10: ");
	int numberTen = input.nextInt();

	int sum = numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix + numberSeven + numberEight + numberNine + numberTen;
	System.out.printf("The result of sum is %d" , sum);

}
}