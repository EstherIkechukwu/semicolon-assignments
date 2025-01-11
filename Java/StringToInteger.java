import java.util.Scanner;
public class StringToInteger{
	public static void main(String [] args){	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	String number = input.nextLine();

	Integer newNumber = Integer.parseInt(number);
	System.out.println("The integer value is: "+ newNumber);

	}


}