import java.util.Scanner;

public class PalindromeWords{
	public static void main(String... args) {
	Scanner input = new Scanner(System.in);
        String duplicate = "";
        
        System.out.print("enter a word to check if its a palindrome: ");
        String word = input.nextLine();
        
        for (int row = 0; row < word.length(); row++) {
            duplicate = word.charAt(row) + duplicate;
        }
        
        if (duplicate.equalsIgnoreCase(word)) {
            System.out.println(word + " is a palindrome");
        } 
	else {
            System.out.println(word + " is not a palindrome");
        }


    }
}
		
