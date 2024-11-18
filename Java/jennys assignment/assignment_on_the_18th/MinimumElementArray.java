public class MinimumElementArray{
	public static void main(String[] args){

	int[] number = {1, 3, 5, 7 ,9 , 10, 15, 2, 8, 25};
	
	int minimum = number[0];

	for(int value : number){
		if(value > minimum){
			minimum = value;
		}
	}
	System.out.println("The Minimum is :" + minimum);
	}


}