import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of terms: ");
	int number = input.nextInt();

		for(int multiple = 0; multiple <= 5; multiple++) {
			int product = number * multiple;
			System.out.printf(" %d * %d = %d%n" , number, multiple, product); 
	
		}


	}

}