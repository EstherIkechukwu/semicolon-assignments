import java.util.Scanner;

public class FindNumber{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int[] numbers = {12, 17, 24, 32, 14};
	
	System.out.print("Enter the number: ");
	int number = input.nextInt();

	getIndex(numbers, number);
}

public static int getIndex(int[] numbers, int number) {
	int check = 0;
	for(int index = 0; index < numbers.length; index++) {
		if (numbers[index] == number){
			check = index;
		}
	}
	return check;
}


}