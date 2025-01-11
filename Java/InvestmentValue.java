import java.util.Scanner;
public class InvestmentValue{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter investment amount: ");
	double investmentAmount = input.nextDouble();

	System.out.print("Enter annual interest rate: ");
	double annualInterestRate = input.nextDouble();

	System.out.print("Enter number of years: ");
	double numberOfYears = input.nextDouble();

	double monthlyInterestRate = (annualInterestRate / 100) / 12;
	
	double power = numberOfYears * 12;
	
	double futureInvestmentRate = investmentAmount * Math.pow(1 + monthlyInterestRate , power);
	System.out.printf("The future investment rate is %f" , futureInvestmentRate);
 




	}

}