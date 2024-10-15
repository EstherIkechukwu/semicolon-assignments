import java.util.Scanner;
public class Acceleration{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Starting velocity: ");
	double startingVelocity = input.nextDouble();
	
	System.out.print("Enter Ending velocity: ");
	double endingVelocity = input.nextDouble();

	System.out.print("Enter Time span: ");
	double timeSpan = input.nextDouble();
	
	double averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;
	System.out.printf("The Average Acceleration is %f" , averageAcceleration);

}
}