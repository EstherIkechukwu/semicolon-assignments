import java.util.Scanner;

public class SumOfDigits{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int counter = 0;
	int total = 0;

	while(counter < 10){
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if(number > 0){
			sum = sum + number;
			System.out.print(sum);
		}
		else{
			System.out.print("Please enter a positive number");
		}
	counter++;
	}

}
}