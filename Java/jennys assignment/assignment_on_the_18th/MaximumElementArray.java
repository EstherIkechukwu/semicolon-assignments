public class MaximumElementArray{
	public static void main(String[] args){

	int[] number = {1, 3, 5, 7 ,9 , 10, 15, 2, 8, 25};
	
	int maximum = number[0];

	for(int value : number){
		if(value > maximum){
			maximum = value;
		}
	}
	System.out.println("The Maximum is :" + maximum);
	}

}