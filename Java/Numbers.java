import java.util.Scanner;
public class Numbers{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number");
	int first = input.nextInt();
	System.out.print("Enter second number");
	int second = input.nextInt();

	System.out.print("Enter third number");
	int third = input.nextInt();

	System.out.print("Enter fourth number");
	int fourth = input.nextInt();

	System.out.print("Enter fifth number");
	int fifth = input.nextInt();

	if(first < 0){
	System.out.printf("%d < 0%n", first);
	}
	if(second < 0){
	System.out.printf("%d < 0%n", second);
 	}
	if (third < 0){
	System.out.printf("%d < 0%n", third);
	}
	if (fourth < 0){
	System.out.printf("%d < 0%n", fourth);
	}
	if (fifth < 0){
	System.out.printf("%d < 0%n", fifth);
	}

	if(first > 0){
	System.out.printf("%d > 0%n", first);
	}
	if(second > 0){
	System.out.printf("%d > 0%n", second);
	}
	if(third > 0){
	System.out.printf("%d > 0%n", third);
	}
	if(fourth > 0){
	System.out.printf("%d > 0%n", fourth);
	}
	if(fifth > 0){
	System.out.printf("%d > 0%n", fifth);
	}

	if(first == 0){
	System.out.printf("%d == 0%n", first);
	}
 	if(second == 0){
	System.out.printf("%d == 0%n", second);
	}
	if(third == 0){
	System.out.printf("%d == 0%n", third);
	}
	if(fourth == 0){  
	System.out.printf("%d == 0%n", fourth);
	}
	if(fifth == 0){
	System.out.printf("%d == 0%n", fifth);
	}
}
}