import java.util.Scanner;
public class LibraryLoopsthree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int counter = 1;

	while(counter <= 3){
		System.out.print("Enter the number of days a member is late to return the book: ");
		int numberOfDays = input.nextInt();

		if(numberOfDays == 5){ 
			System.out.print("fine is 50 paise\n");
		}
		else if(numberOfDays == 6 && numberOfDays < 10){ 
			System.out.print("fine is 1 Rupee\n");
		}
		else if(numberOfDays >= 10){ 
			System.out.print("fine is 5 Rupee\n");
		}
		else if(numberOfDays  >= 30){ 
			System.out.print("membership is cancelled\n");
		}

		counter++;


	}

}

}