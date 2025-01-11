import java.util.Scanner;
public class WorkerEfficiency{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter time taken: ");
	int timeTaken = input.nextInt();
	
		if(timeTaken <= 3){
			System.out.print("this worker is highly efficient");
		}
		else if(timeTaken <=4){
			System.out.print("this worker should improve speed");
		}
		else if(timeTaken <= 5){
			System.out.print("This worker should be given training to improve his speed");
		}
		else if(timeTaken > 5){
			System.out.print("This worker is fired");
		}




	}



}