import java.util.Scanner;
public class Count{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int count = 0;
	int positive = 0;
	int negative = 0;
	int zero = 0;

 while (count <= 5) {

			System.out.print("Enter a number: " );
			int number = input.nextInt();

			if (number > 0){
			positive += 1;
			}
			else if(number < 0){
			negative += 1;
			}
			else{
			zero += 1;
			}
			count++;

		}
			System.out.println("the number of positive is: " + positive);
			System.out.println("the number of negative is: " + negative);
			System.out.println("the number of zero is: " + zero);
		
	
	}
}