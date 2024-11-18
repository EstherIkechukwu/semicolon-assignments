import java.util.Scanner;

public class DuplicatesArray{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of values you want to input: ");
	int element = input.nextInt();
		
	int[] numbers = new int[element];

	System.out.println("Enter the values: ");
		
	for (int count = 0; count < element; count++) {
		numbers[count] = input.nextInt();
	} 
	
	System.out.print("The duplicate number in the array is: ");
	for (int count = 0; count < element; count++) {
		for (int counter = count + 1; counter < element; counter++) {
			if (numbers[count] == numbers[counter]) {
				System.out.print(numbers[count] + " ");
				break;
			}
		}
	}

		
}


}







}