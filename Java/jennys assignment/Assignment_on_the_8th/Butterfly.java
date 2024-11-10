import java.util.Scanner;

public class Butterfly{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a pattern number: ");
	int value = input.nextInt();

	for(int number = 1; number <= value; number++){
		for(int row = 1; row <= number; row++){
			System.out.print("*");
		}
		System.out.println();

		for(int integer = 1; integer <= value; integer++){

		for(int next = 1; next <= value - integer ; next++){
			System.out.print(" ");
		}
		for (int number = 1; number <= integer; number++){
			System.out.print("*");
		}
		System.out.println();
	}

	for(int line = value; line >= 1; line--){
		for(int number = 1; number < line; number++){					System.out.print("*");
		}
		System.out.println();

	for(int count = value; count >= 1; count--){

		for (int index = 1; index <= value - count; index++) {
			System.out.print(" ");
		}
		for (int number = 1; number <= count; number++){
			System.out.print("*");
		}
		System.out.println();
	}

	}


	
		

	
		
	
	


}

}