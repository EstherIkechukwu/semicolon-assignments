import java.util.Scanner;
public class Price{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter driving distance: ");
	double drivingDistance = input.nextDouble();

	System.out.print("Enter fuel effiency in mile per gallon: ");
	double fuelEfficency = input.nextDouble();

	System.out.print("Enter price of fuel: ");
	double priceOfFuel = input.nextDouble();

	double costOfDrivingDistance = (drivingDistance / fuelEfficency) * priceOfFuel;

	System.out.printf(" The result of cost of driving distance is $%f" , costOfDrivingDistance);
}
}
 