import java.util.Scanner;

public class Age{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Input your age: ");
	int userAge = input.nextInt();

		if(userAge <= 12){
			System.out.print("awww!, you are a child");
		}
		else if(userAge == 13 && userAge <= 17){
			System.out.print("Cute!, you are a teenager");
		}
		else if(userAge == 18 && userAge <= 64){
			System.out.print("Hello Adult");
		}
		else if(userAge >= 65){
			System.out.print("Senior");
		}


	






	}



}