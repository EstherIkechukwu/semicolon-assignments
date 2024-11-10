import java.util.Scanner;

public class Course{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Hello, Welcome: Kindly Input your chosen course, please press:\n1. Math\n2. Science\n3. History");
	int selection = input.nextInt();

	switch(selection){
	case 1:
	System.out.println("Welcome!\n");

	System.out.println("1. Freshman\n2. Sophomore\n3. Junior\n4. Senior");
	int gradeLevelOne = input.nextInt();

		switch(gradeLevelOne){

		case 1:
		System.out.print("Welcome to this new Academic year, Math is a interesting course. This year we will be dealing majorly with statistics, Algebra, and Graphs.  I'm looking forward to see you in class.");

		break;

		case 2:
		System.out.print("Welcome back Sophomore, It's a new academic year, For Mathematics this year, we would revist the topics that were taught in freshman year, regardless come with your calculators, see you in class");

		break;
		
		case 3:
		System.out.print("Welcome back, For the academic session, we will learn more about fractions and Simple quardratic equations. prepare, see you on Monday ");
		break;

		case 4:
		System.out.print("Welcome back Senior, For the academic session, we will learn more about Advanced quardratic equations. Bring your calculators, see you in class next week!");
		}
		break;

	case 2:
	System.out.println("Welcome!\n");

	System.out.println("1. Freshman\n2. Sophomore\n3. Junior\n4. Senior");
	int gradeLevelTwo = input.nextInt();

		switch(gradeLevelTwo){

		case 1:
		System.out.print("Welcome to this new Academic year, Science is a interesting course. This year we will be dealing majorly with Introduction to science and basic concepts. I'm looking forward to see you in class.");

		break;

		case 2:
		System.out.print("Welcome back Sophomore, It's a new academic year, For Sciences this year, we would revist the topics that were taught in freshman year, see you in class");

		break;
		
		case 3:
		System.out.print("Welcome back, For the academic session, we will learn more about all Body systems. prepare, see you on Monday ");

		break;

		case 4:
		System.out.print("Welcome back Senior, For the academic session, we will learn more about Advanced Science subjects, and deal with praticals, Class start next week, see you in class next week!");
		}
		break;

	case 3:
	System.out.println("Welcome!\n");

	System.out.println("1. Freshman\n2. Sophomore\n3. Junior\n4. Senior");
	int gradeLevelThree = input.nextInt();

		switch(gradeLevelThree){

		case 1:
		System.out.print("Welcome to this new Academic year, History is a interesting course. This year we will be dealing majorly with Introduction to History and look at te lives of patortics we are familar with. I'm looking forward to see you in class.");

		break;

		case 2:
		System.out.print("Welcome back Sophomore, It's a new academic year, For History this year, we would revist the topics that were taught in freshman year, see you in class");

		break;
		
		case 3:
		System.out.print("Welcome back, For the academic session, we will learn more about History , prepare, see you on Monday ");
		
		break;

		case 4:
		System.out.print("Welcome back Senior, For the academic session, we will learn more about Advanced Historical subjects, Class start next week, see you in class next week!");
		}



	}

}
}









