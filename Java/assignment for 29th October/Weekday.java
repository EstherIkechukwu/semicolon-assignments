import java.util.Scanner;
public class WeekDay{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int weekNumber = input.nextInt();

	if (weekNumber == 1){
	System.out.printf(" Sunday");
	}
	else if (weekNumber == 2){
	System.out.printf("Monday");
	} 
	else if (weekNumber == 3){
	System.out.printf("Tuesday");
	} 
	else if (weekNumber == 4){
	System.out.printf("Wednesday");
	} 
	else if (weekNumber == 5){
	System.out.printf("Thursday");
	} 
	else if (weekNumber == 6){
	System.out.printf("Friday");
	} 
	else {
	System.out.printf("Saturday");
	} 

 





	}

}