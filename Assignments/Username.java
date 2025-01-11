import java.util.Scanner;
public class Username{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your username: " );
	String userName = input.nextLine();

	System.out.print("Hi " + userName +  ", nice to meet you!");
	System.out.println("\nHi " + userName +  ", nice to meet you!");
	System.out.printf("Hi %s, nice to meet you!" , userName);
	

}
}