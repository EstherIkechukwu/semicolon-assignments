import java.util.Scanner;

public class AtPattern{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a pattern number: ");
	int value = input.nextInt();

	for (int point = 1; point <= value; point++){
		for (int index = 1; index <= value - point; index++) {
			System.out.print(" ");
		}
		for (int number = 1; number <= point; number++){
			System.out.print("@");
		}
		System.out.println();
	}

	


	}
}