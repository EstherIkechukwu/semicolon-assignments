import java.util.Scanner;

public class Temperature{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a temperature in Celsius: ");
	int temperature = input.nextInt();

		if(temperature < 10){
			System.out.print("cold!");
		}
		else if(temperature >= 25){
			System.out.print("warm!");
		}
		else if(temperature > 25){
			System.out.print("hot!")
		}



	}


}