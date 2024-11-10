import java.util.Scanner;

public class Eligible{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your age: ");
	int age = input.nextInt();

		if(age >= 18){
			System.out.print("you can vote!");
		}
	
		else if(age >= 16){
			System.out.print("you can drive!");
		}

 		else if(age >= 21){
			System.out.print("you can drink!");
		}




	}
}