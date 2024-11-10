public class AverageArray{
	public static void main(String[] args){

	int[] number = {23,35,8,12,14,18,4,9};
	int sum = 0;

	for(int each : number){
		sum += each;
	}
	System.out.printf("The average is %d: " , (sum/number.length));




	}


}