import java.util.Scanner;
public class LibraryLoops{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int stop = -1;

	do{
		System.out.print("Enter the number of days a member is late to return the book: ");
		int numberOfDays = input.nextInt();

		if(numberOfDays == 5){ 
			System.out.print("fine is 50 paise\n");
		}
		else if(numberOfDays == 6 && numberOfDays < 10){ 
			System.out.print("fine is 1 Rupee");
		}
		else if(numberOfDays >= 10){ 
			System.out.print("fine is 5 Rupee");
		}
		else if(numberOfDays  >= 30){ 
			System.out.print("membership is cancelled");
		}

		System.out.print("Do you want to stop the operation ?, if yes, enter -1. if No,enter any number: ");
		 stop = input.nextInt();

	}

		while(stop != -1);




	}


}