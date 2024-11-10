import java.util.Scanner;

public class Department{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Hello, Welcome: Kindly Input your department, please press:\n1. IT\n2. HR\n3. Finance");
	int role = input.nextInt();


	switch(role){
	case 1:
	System.out.println("Hello There!");

	System.out.println("1. Manager\n2. Analyst\n3. Intern");
	int manager = input.nextInt();

		switch(manager){

		case 1:
		System.out.print("You are an Amazing Manager , your work rate in the past year has been really efficent, how you coordinate the teams, assign roles and get task done speedily. Thank you for giving to this organization. Merry chrsitmas and Happy New year in advance!");
		break;

		case 2:
		System.out.print("This role as an Analyst is most befitting for you, you are excellent in your job, your attention to details is impeccable, Thank for our beloved Analyst");
		break;
		
		case 3:
		System.out.print("Welcome to your role as an intern, we are glad to have you here,");
		}
	break;

	case 2:
	System.out.println("Hi!");

	System.out.println("1. Manager\n2. Analyst\n3. Intern");
	int analyst = input.nextInt();

		switch(analyst){
		case 1:
		System.out.print("You are an Amazing Manager , your work rate in the past year has been really efficent, how you coordinate the teams, assign roles and get task done speedily. Thank you for giving to this organization. Merry chrsitmas and Happy New year in advance!");
		break;

		case 2:
		System.out.print("This role as an Analyst is most befitting for you, you are excellent in your job, your attention to details is impeccable, Thank for our beloved Analyst");
		break;

		case 3:
		System.out.print("Welcome to your role as an intern, we are glad to have you here,");
		}
	break;


	case 3:
	System.out.println("Hello!");

	System.out.println("1. Manager\n2. Analyst\n3. Intern");
	int intern = input.nextInt();

		switch(intern){
		case 1:
		System.out.print("You are an Amazing Manager , your work rate in the past year has been really efficent, how you coordinate the teams, assign roles and get task done speedily. Thank you for giving to this organization. Merry chrsitmas and Happy New year in advance!");
		break;

		case 2:
		System.out.print("This role as an Analyst is most befitting for you, you are excellent in your job, your attention to details is impeccable, Thank for our beloved Analyst");
		break;

		case 3:
		System.out.print("Welcome to your role as an intern, we are glad to have you here,");
		}



		
	}

	}
}
