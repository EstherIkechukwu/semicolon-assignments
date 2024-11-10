import java.util.Scanner;

public class PascalTriangle{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int value = input.nextInt();

	for(int point 1; point <= value; point++){
		for(int index = 1; index < point; index++){
			System.out.print(index);
		}	
	}


}

}