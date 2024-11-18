public class MergeSortedArray{
	public static void main(String[] args){

	int[] numberOne = {1,3,5};
	int[] numberTwo = {2,4,6};

	int[] combinedNumber = new int[numberOne.length + numberTwo.length];
	for(int counter = 0; counter < numberOne.length; counter++){
		combinedNumber[counter] = numberOne[counter];

	}
	
	for(int counter = 0; counter < numberTwo.length; counter++){
		combinedNumber[counter+3] = numberTwo[counter];

	}










	}






}


