public class MultiplicationTableResult{
	public static void main(String [] args){
	
		for(int multiple = 1; multiple <= 12; multiple++){
				for(int times = 2; times <= 20; times++){
					System.out.print(multiple * times + "\t");
				}
			System.out.println();
		}

	}

}