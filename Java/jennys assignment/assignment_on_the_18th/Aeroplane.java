import java.util.Scanner;

public class Aeroplane{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	boolean[] seats = {false, false, false, false, false, false, false, false, false, false};
	//for(int response = 0; response < 10; response++){
		System.out.println("Please type 1 for first class\n Please type 2 for Economy\n");
		int userResponse = input.nextInt();

		if(userResponse == 1 && seats[userResponse - 1] == false){
			System.out.print("Welcome! You are in first class\n");
				
		}

		else {

		}

		else if(userResponse == 1 && seats[1] == false){
			System.out.print("Welcome! You are in first class\n");
		}
		else if(userResponse == 1 && seats[2] == false){
			System.out.print("Welcome! You are in first class\n");
		}
		else if(userResponse == 1 && seats[3] == false){
			System.out.print("Welcome! You are in first class\n");
		}
		else if(userResponse == 1 && seats[4] == false){
			System.out.print("Welcome! You are in first class\n");
		}
		else if(userResponse == 2 && seats[5] == false){
			System.out.print("Welcome! You are in Economy\n");
		}
		else if(userResponse == 2 && seats[6] == false){
			System.out.print("Welcome! You are in Economy\n");
		}
		else if(userResponse == 2 && seats[7] == false){
			System.out.print("Welcome! You are in Economy\n");
		}
		else if(userResponse == 2 && seats[8] == false){
			System.out.print("Welcome! You are in Economy\n");
		}
		else if(userResponse == 2 && seats[9] == false){
			System.out.print("Welcome! You are in Economy\n");
		}
		else{
			System.out.print("The seat has been occupied");

		}



	//}
	





}

}