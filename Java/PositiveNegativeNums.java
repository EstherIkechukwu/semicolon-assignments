import java.util.Scanner;
public class PositiveNegativeNums{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int integer = input.nextInt();

		if(integer > 0){
			System.out.print("Integer is positive\n");
		}
		else if(integer < 0){
			System.out.print("Integer is negative\n");
		} 
		else if(integer == 0 ){
			System.out.print("Integer is zero\n"); 
		}
	}

}