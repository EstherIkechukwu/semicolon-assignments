import java.util.Scanner;
public class CompareLargeSmall{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int smallest = 0;
	int userValue;

	do{
		System.out.print("Enter a number or 0 to stop the operation: ")
		userValue = input.nextInt();

		if(userValue > largest){
			largest = userValue;
		}
		else if(userValue < smallest){
			smallest = userValue;
		}
	
	}
	while (userValue != 0);
	System.out.print("Largest is %d%n smallest is %d%n" ,largest,smallest); 


	}

}