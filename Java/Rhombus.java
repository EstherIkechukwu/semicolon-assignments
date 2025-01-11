public class Rhombus{
	public static void main(String [] args){

	String letters = "ABC";

		for (int alphabet = 1; alphabet <= 7; alphabet++){
			for(int next = 1; next <= 7 - alphabet; next++){
				System.out.print(" ");
			}
			for (int number = 1; number <= alphabet; number++){
				System.out.print(letters );
			}
			System.out.println();
		}
		for (int alphabet = 7; alphabet >= 1; alphabet--){
			for (int index = 1; index <= 7 - alphabet; index++) {
				System.out.print(" ");
			}
			for (int number = 1; number <= alphabet; number++){
				System.out.print( letters);
			}
			System.out.println();
		}
		


	}
}