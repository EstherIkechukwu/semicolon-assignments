import java.util.Scanner;

public class PerfectNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int sum = 0;

	System.out.print("Enter a number: ");
	int number = input.nextInt();

		for(int counter = 1; counter < number; counter++){
			if(number % counter == 0){
				sum += counter
				System.out.print(sum)
			}
		}
		if (sum != number){
			System.out.print("it is not a perfect number");
		}
		else{
			System.out.print("It is a perfect number");
		}

	}
}
	

	












	}

	

}