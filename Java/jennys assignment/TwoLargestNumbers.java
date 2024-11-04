import java.util.Scanner;
public class TwoLargestNumbers{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

int counter = 1;
int largest = number;
int secondLargest = 0;

	System.out.print("Enter a number: ");
	int number = input.nextInt();

		while(counter < 10){
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			if(number > largest){
				secondLargest = largest;
				largest = number;
			}
			else if(number > secondLargest){
				secondLargest = number;
			}
		counter++;

		}
		System.out.printf("%d%n" , largest);
		System.out.printf("%d%n" , secondLargest);


	}

}