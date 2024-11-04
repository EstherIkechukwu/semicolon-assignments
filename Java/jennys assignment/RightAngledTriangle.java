import java.util.Scanner;

public class RightAngledTriangle{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the length of base of a triangle: ")
	int length = input.nextInt();		
		for(int count = 1; count <= length; count++){
			for(int base = 1; base <= count; base++){
				System.out.print("*")
			}
			System.out.println();
		}


	}


}