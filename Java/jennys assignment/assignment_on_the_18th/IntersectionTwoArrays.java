public class IntersectionTwoArrays{
	public static void main(String[] args){
	
	int[] arrayOne = {1,2,3,4};
	int[] arrayTwo = {3,4,7,8,19};

	for(int counter = 0; counter < arrayOne.length; counter++){
		for(int counterTwo = 0; counterTwo < arrayTwo.length; counter++){
			if(arrayOne[counter] == arrayTwo[counterTwo]){
				System.out.print(arrayOne[counter] + " ")
				break;
			}
		}

	}


}
}