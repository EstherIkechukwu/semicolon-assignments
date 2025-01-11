public class Thirty{
	public static void main (String[]args){
	//System.out.println("number\tsquare\tcubes\tQuart");

		for(int index = 0; index <= 1000; index ++){
			int square = index * index;
			int cubes = index * index * index;
			int quart = index * index * index * index;
			System.out.println(index + "\t" + square + "\t" + cubes + "\t" + quart);
		
		}
		int one= 3;
		System.out.println(one +"   "+one);
	
	}
}