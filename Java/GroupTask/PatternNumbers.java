public class PatternNumbers{
	public static void main(String[] args){        

	for (int number = 0; number < 3; number++) { 
		for (int index = 0; index < 3; index++) { 
                	int value = number * 3 + index + 1; 
                	System.out.print(value + " ");
            	}
		System.out.println(); 
	}
  


}
}