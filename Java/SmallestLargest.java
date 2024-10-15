import java.util.Scanner;
public class SmallestLargest{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer: ");
	int firstInteger = input.nextInt();

	System.out.print("Enter second integer: ");
	int secondInteger = input.nextInt();

	System.out.print("Enter third integer: ");
	int thirdInteger = input.nextInt();

	int addition = firstInteger + secondInteger + thirdInteger;
	System.out.printf("Result of Addition is %d%n" , addition);

	int average = addition / 3;
	System.out.printf("Result of average is %d%n" , average);

	int product = firstInteger * secondInteger * thirdInteger;
	System.out.printf("Result of product is %d%n" , product);

	int largest = 0;
	int smallest = 0;
	if(firstInteger > secondInteger && firstInteger > thirdInteger){
		largest = firstInteger; 
		}
	else if(secondInteger > firstInteger && secondInteger > thirdInteger){
		largest = secondInteger;
		}
	else if(thirdInteger > secondInteger && thirdInteger > firstInteger){
		largest = thirdInteger;
		}
	else {
		System.out.println("They are all equal");
	}
	if(firstInteger < secondInteger && firstInteger < thirdInteger){
		smallest = firstInteger;
		}
	else if(secondInteger < firstInteger && secondInteger < thirdInteger){
		smallest = secondInteger;
		}
	else if(thirdInteger < secondInteger && thirdInteger < firstInteger){
		smallest = thirdInteger;
		}
	else {
		System.out.println("They are all equal");
	}
	System.out.printf("%nThe largest is %d%n" , largest);
	System.out.printf("The smallest is %d" , smallest); 

	}
}
