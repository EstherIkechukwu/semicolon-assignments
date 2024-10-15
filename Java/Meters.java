import java.util.Scanner;
public class Meters{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number in feet");
	double numberInFeet = input.nextDouble();

	double meters = numberInFeet * 0.305;
	System.out.printf("The result in feets is %f" , meters);


}
}