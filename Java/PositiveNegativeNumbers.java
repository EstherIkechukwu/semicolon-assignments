import java.util.Scanner;
public class PositiveNegativeNumbers{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int integer = 0;

		while(integer != -1){

			System.out.print("Enter a number: ");
			integer = input.nextInt();

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



}