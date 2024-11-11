import java.util.Scanner;

public class Divide{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	for(int count = 1; count <= number; count++){
		if(count % 7 == 0 && count % 13 == 0){
			System.out.print(count);
		}
	}

}
}
		