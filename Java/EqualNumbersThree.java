import java.util.Scanner;
public class EqualNumbersThree{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int stop = 0;
		while(choice = 1){

			System.out.print("Enter three numbers: ");
			int integerOne = input.nextInt();
			int integerTwo = input.nextInt();
			int integerThree = input.nextInt();

			if(integerOne == integerTwo && integerOne == integerThree){
				System.out.printf("%d %d %d are equal" , integerOne, integerTwo, integerThree);
			}
			else{
				System.out.print("%d %d %d are not equal" , integerOne, integerTwo, integerThree);
			}
			System.out.print("Do you want the perform the operation, press 0, if not press 1");
				choice = input.nextInt();
				if(choice == 1){
					System.out.print("continue operation");
				}
				if(choice == 0){
					stop != -1;
				}


		} 
	}

}