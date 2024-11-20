import java.util.Scanner;

public class MarksAndAttendance{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Kindly Enter your mark:\n1. 50\n2. 80\n3. 100\n");
	int studentMarks = input.nextInt();
	
	switch(studentMarks){
	case 1:
	System.out.println("Enter your attendance: ");
	System.out.println("1. 10\n2. 20\n3. 30");
	int attendance = input.nextInt();
		switch (attendance){
		case 1:
		System.out.print("Your grade is D"); break;
		
		case 2:
		System.out.print("Your grade is B"); break;

		case 3:
		System.out.print("Your grade is A");
		}
		
	break;
	case 2:
	System.out.println("Enter your attendance: ");
	System.out.println("1. 20\n2. 30\n3. 20");
	int attendanceTwo = input.nextInt();
		switch (attendanceTwo){
		case 1:
		System.out.print("Your grade is C"); break;
		
		case 2:
		System.out.print("Your grade is B"); break;

		case 3:
		System.out.print("Your grade is A");
		}

	break;

	case 3:
	System.out.println("Enter your attendance: ");
	System.out.println("1. 20\n2. 30\n3. 20");
	int attendanceThree = input.nextInt();
		switch (attendanceThree){
		case 1:
		System.out.print("Your grade is C"); break;
		
		case 2:
		System.out.print("Your grade is B"); break;

		case 3:
		System.out.print("Your grade is A");
		}

	}




	}



}