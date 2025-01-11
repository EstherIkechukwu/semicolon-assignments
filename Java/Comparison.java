import java.util.Scanner;
public class Comparison{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first integer: ");
	int firstInteger = input.nextInt();

	System.out.print("Enter second integer: ");
	int secondInteger = input.nextInt();

		if(firstInteger >= secondInteger){
		int expression = firstInteger - secondInteger;
		System.out.printf("%d", expression); 	
		}
		
		if(firstInteger <= secondInteger){
		int sum = firstInteger + secondInteger;
		System.out.printf("%d" , sum);
		}

	}
}