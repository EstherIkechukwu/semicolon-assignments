import java.util.Scanner;

public class IceCreamShop{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Hello, Menu: Kindly What is your order? , please press:\n1. Ice cream\n2. sundae\n3. Shake");
	int selection = input.nextInt();

	switch(selection){
	case 1:

	System.out.println("1. Chocolate\n2. Vanilla\n3. Stawberry");
	int flavour = input.nextInt();

		switch(flavour){

			case 1:
			System.out.print("Chocolate Flavoured Ice-cream");
			break;

			case 2:
			System.out.print("Vanilla Flavoured Ice-cream");
			break;
		
			case 3:
			System.out.print("Stawberry Flavoured Ice-cream");
		}
		break;
	
	case 2:

	System.out.println("1. Chocolate\n2. Vanilla\n3. Stawberry");
	int flavourSundae = input.nextInt();

		switch(flavourSundae){

			case 1:
			System.out.print("Chocolate Flavoured Sundae");
			break;

			case 2:
			System.out.print("Vanilla Flavoured Sundae");
			break;
		
			case 3:
			System.out.print("Stawberry Flavoured Sundae");
		}
		break;

	case 3:

	System.out.println("1. Chocolate\n2. Vanilla\n3. Stawberry");
	int flavourShake = input.nextInt();

		switch(flavourShake){

			case 1:
			System.out.print("Chocolate Flavoured Shake");
			break;

			case 2:
			System.out.print("Vanilla Flavoured Shake");
			break;
		
			case 3:
			System.out.print("Stawberry Flavoured Shake");
		}
		
	}


}
}
	

	




