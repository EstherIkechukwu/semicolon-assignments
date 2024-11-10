import java.util.Scanner;

public class Income{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your annual income: ");
	int annualIncome = input.nextInt();

		if (annualIncome <= $9,875){
			System.out.print("10%");
		}

 		else if(annualIncome == 9,875 && annualIncome <= $40,125){
			System.out.print("12%");
		}

		else if(annualIncome == $40,125 && annualIncome <= $85,525){
			System.out.print("22%");
		}

 		else if(annualIncome >= $85,525){
			System.out.print("24%");
		}





	}
}