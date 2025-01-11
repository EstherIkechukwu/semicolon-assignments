import java.util.Scanner;
public class Kilogram{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print ("Enter number in pounds");
	double numberInPounds = input.nextDouble();

	double kilogram = numberInPounds * 0.454;
	System.out.printf("The result is %f" , kilogram);
	
}
}