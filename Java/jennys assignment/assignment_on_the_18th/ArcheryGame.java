import java.util.Scanner;

public class ArcheryGame{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int[][] score = new int[4][3];


	for(int row = 0; row < score.length; row++){
		for(int column = 0; column < score[row].length; column++){
			 score[row][column] = (int)(Math.random() * 100); 
		}
	}
	
	for(int row = 0; row < score.length; row++){
	int total = 0;
	System.out.print("Player" + (row + 1));
		for(int column = 0; column < score[row].length; column++){
			System.out.printf("\t%d", score[row][column]);	
			total += score[row][column];
		}
		System.out.printf("\t%d" , total);
		System.out.println();	
	}
	

}

}