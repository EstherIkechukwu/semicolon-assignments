public class SumArrays{

	public static int getNumbersSum(int[] integers){
		int largest = integers[0];
		int smallest = integers[0];
		int largestIndex = 0;
		int smallestIndex = 0;
		for(int index = 0; index < integers.length; index++){
			if(integers[index] > largest){
				largest = integers[index];
				largestIndex = index;
			}
			else if(integers[index] < smallest){
				smallest = integers[index];
				smallestIndex = index;
			}
		}
		int[] indexList = {largestIndex, smallestIndex};
			return indexList;
	}


}