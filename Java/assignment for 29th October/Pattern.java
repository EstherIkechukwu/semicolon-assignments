public class Pattern{
	public static void main(String [] args){

		System.out.println("Pattern A");
		for(int asterisks = 1; asterisks < 7; asterisks++){
		   for(int number = 0; number < asterisks; number++){
			System.out.print("*");
		}
		System.out.println();

	}

	System.out.println("Pattern B");

	for(int asterisks = 7; asterisks > 0; asterisks--){
	  for(int number = 0; number < asterisks; number++){					System.out.print("*");

			}
		System.out.println();
		
		}

	System.out.println("Pattern C");

	for(int number = 0; number < 7; number++){
		for(int asterisks =6; asterisks > 0; asterisks--){
			System.out.print(" ");
		
			}
		for(int index = 0; index < (asterisks-number); index++){

			System.out.print("*");
				}
			
		}



	}

}