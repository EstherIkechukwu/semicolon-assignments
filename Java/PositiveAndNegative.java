import java.util.Scanner;
public class PositiveAndNegative{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	Boolean condition = true;
	int positive = 0;
	int negative = 0;
	int sentinelValue = -1;

		while (sentinelValue != -1){
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			if (number > 0) {
				System.out.print("Integer is positive\n");
			} 

			else if (number < 0) {
				System.out.print("Integer is negative\n");
			}
			else{
				System.out.print("Integer is zero\n");
			}
		}
		System.out.print("do you want to quit the operation? if yes press -1, if no press 0 ");
			sentinelValue = input.nextInt();

		
	}

}