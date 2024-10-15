public class SquareCubes{
	public static void main(String [] args){

		System.out.println("number\tSquares\tCubes");

		for( int index = 0; index <= 10; index++){
			int squares = index * index;
			int cubes = index * index * index;
			System.out.println(index + "\t" + squares + "\t" + cubes);
		}

	}
}