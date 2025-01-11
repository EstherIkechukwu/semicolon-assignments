import java.util.Scanner;

public class Determinant3x3Matrix {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.println("Enter the nine elements of the matrix:");
        double elementOne = input.nextDouble();
        double elementTwo = input.nextDouble();
        double elementThree = input.nextDouble();
        double elementFour = input.nextDouble();
        double elementFive = input.nextDouble();
        double elementSix = input.nextDouble();
        double elementSeven = input.nextDouble();
        double elementEight = input.nextDouble();
        double elementNine = input.nextDouble();

        double determinant = elementOne * (elementFive * elementNine - elementSix * elementEight) -
                             elementTwo * (elementFour * elementNine - elementSix * elementSeven) +
                             elementThree * (elementFour * elementEight - elementFive * elementSeven);

      
        System.out.println("The determinant is: " + determinant);
    }
}