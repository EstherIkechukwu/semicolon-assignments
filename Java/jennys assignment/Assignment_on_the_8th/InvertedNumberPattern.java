import java.util.Scanner;

public class InvertedNumberPattern{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter a pattern number: ");
	int value = input.nextInt();

	for(int number = 1; number <= value; number++){
		for(int row = 1; row <= number; row++){
			System.out.print(row);
		}
		System.out.println();
	}

	for(int line = value; line >= 1; line--){
		for(int number = 1; number <= line; number++){					System.out.print(number);
		}
		System.out.println();
	}




}

}
