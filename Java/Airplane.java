import java.util.Scanner;
public class Airplane{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the velocity in meter/second");
	double velocity = input.nextDouble();

	System.out.print("Enter the acceleration in meter/second");
	double acceleration = input.nextDouble();

	double runwayLength = velocity * velocity/ 2 * acceleration;
	System.out.printf("The runway length is %f " , runwayLength);
	}
}