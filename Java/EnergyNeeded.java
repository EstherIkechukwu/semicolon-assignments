import java.util.Scanner;
public class WaterEnergyNeeded{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of water in kilogram");
	double waterInKilogram = input.nextDouble();

	System.out.print("Enter initial temperature");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter final temperature");
	double finalTemperature = input.nextDouble();

	double energyNeeded = weightOfWaterInKilogram * (finalTemperature - initialTemperature) * 4184;
	double energyNeeded = input.nextDouble();

	System.out.printf("The energy needed to heat water is %f" , energyNeeded);
	}
}