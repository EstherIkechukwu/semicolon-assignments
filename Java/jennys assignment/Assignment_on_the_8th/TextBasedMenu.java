import java.util.Scanner;

public class TextBasedMenu{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int menuOption = 0;

		while(menuOption != 4){
			System.out.println("MENU:\n1. Add\n2. View\n3. Delete\n4. Quit");
			menuOption = input.nextInt();
		}

	}
}