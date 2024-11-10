public class ReverseMultiplicationTable{
	public static void main(String [] args){
	
		for(int multiple = 1; multiple < 13; multiple++){
			for(int times = 10; times > 1; times--){
				int product = multiple * times;
				System.out.printf("%d * %d = %d\t" , times, multiple, product);
			}
			System.out.println();

		}

	}


}