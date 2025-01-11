import java.util.Scanner;
public class GreaterSumOpeartors{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Give a number: ");
	int firstNumber = input.nextInt();

	System.out.print("Give a number: ");
	int secondNumber = input.nextInt();

	System.out.print("Give a number: ");
	int thirdNumber = input.nextInt();

	if(firstNumber > secondNumber){
		 System.out.print("Greater\n")
	}
	if(firstNumber >= secondNumber){
		 System.out.print("Greater\n")
	}
	if(firstNumber != secondNumber){
		 System.out.print("Greater\n")
	}
	if(firstNumber == secondNumber){
		 System.out.print("Greater\n")
	}
	if(firstNumber <= secondNumber){
		 System.out.print("Greater\n")
	}
	if(firstNumber ^ secondNumber){
		 System.out.print("Greater\n")
	}
	if(firstNumber || secondNumber){
		 System.out.print("Greater\n")
	}
	if(firstNumber | secondNumber){
		 System.out.print("Greater\n")
	}
	if(firstNumber > secondNumber && firstNumber == thirdNumber ){
		 System.out.print("they are equal")
	}
	}
	if(firstNumber > secondNumber & firstNumber != thirdNumber ){
		 System.out.print("nah")
	}


}
}