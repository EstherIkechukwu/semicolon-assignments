import java.util.Scanner;
public class Maximum{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int firstNumber = 78;
	int secondNumber = 23;
	int thirdNumber = 12;

	int largest = 0;
		if(firstNumber > secondNumber && firstNumber > thirdNumber);
			largest = firstNumber;
		
		if(secondNumber > firstNumber  && secondNumber > thirdNumber);
			largest = secondNumber; 
		
		if(thirdNumber > secondNumber && thirdNumber >firstNumber );
			largest = thirdNumber; 
		
		System.out.printf(" The largest number is %d" , largest);


	}

}