public class MaxMinArray{
	public static void main(String[] args){

	int[] number = {3,5,8,12,14,8,18,4,9};
	
	int maximum = number[0];
	int minimum = number[0];

	for(int value : number){
		if(value > maximum){
			maximum = value;
		}
		else if(value < minimum){
			minimum = value;
		}
	}
	System.out.println("The Maximum is :" + maximum);
	System.out.println("The Minimum is :" + minimum);




	}


}