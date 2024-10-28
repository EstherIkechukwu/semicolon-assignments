import java.util.Scanner;
public class VowelConsonant{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an Alphabet: ");
	String letter = input.nextLine();


		if( letter.matches("a|e|i|o|u")){
			System.out.print("It is a vowel");
		}
		else {
			System.out.print("It's a consonant");
		}

	}

}