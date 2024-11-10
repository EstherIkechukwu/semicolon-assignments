import java.util.Scanner;

public class AwardRank{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Hello, Welcome: Kindly Select a number, please press:\n1.\n2.\n3.\n4.");
	int rank = input.nextInt();

		switch(rank){

		case 1:
		System.out.print("Congratulation!, You won a Gold Medal");
		break;

		case 2:
		System.out.print("Congratulation!, You won a Silver Medal");
		break;

		case 3:
		System.out.print("Congratulation!, You won a Bronze Medal");
		break;

		case 4:
		System.out.print("You deserve a Participant Ribbon, Congratulation");

		}
	

	}
}
