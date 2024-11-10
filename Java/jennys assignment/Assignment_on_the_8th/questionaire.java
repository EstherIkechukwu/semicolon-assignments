import java.util.Scanner;
import java.util.Arrays;

public class Questionaire{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String[][] questions = {
	{"A. expend energy, enjoy group", "\t\tB. conserve energy, enjoy one on one"},
	{"A. Interpret literally", "\t\tB. look for meaning and possibilities"},
	{"A. Logical, thinking, questioning", "\t\tB. Empathetic, feeling, accomadating"},
	{"A. organized, orderly", "\t\tB. Flexible, adaptable"},
	{"A. more outgoing, think out loud", "\t\tB. more reserved, think to yourself"},
	{"A. Practical, realistic, experiential", "\t\tB. Imaginative, innovative, theoretical"},
	{"A. Candid, straight forward, frank", "\t\tB. Tactful, kind, encouraging"},
	{"A. Plan, schedule", "\t\tB. unplanned, Spontaneous"},
	{"A. Seek many tasks, public activities, interaction with others", "\t\tB. seek private, solitary activities with quiet to concentrate"},
	{"A. Standard, usual, conventional", "\t\tB. Different, novel, unique"},
	{"firm, tend to criticize, hold the line", "\t\tB. gentle, tend to appreciate, conciliate"},
	{"regulated, structured", "\t\tB. Easy-going, live and let live"},
	{"A.External, communicative, express yourself", "\t\tB. Internal, reticent, keep to yourself"},
	{"A. Focus on here-and-now", "\t\tB. Look to the future, global prespective, big picture"},
	{"A. tough-minded, just", "\t\tB. tender-hearted, merciful"},
	{"A. preparation, plan ahead", "\t\tB. go with the flow, adapt as you go"},
	{"A. Active, initiate", "\t\tB. reflective, deliberate"},
	{"A. facts, things, what is", "\t\tB. ideas, dreams , what could be, philosophical"},
	{"A. matter of fact, issue-oriented", "\t\tB. sensitive, people-oriented, compassionate"},
	{"A. control, govern", "\t\tB. latitude, freedom"}

	};

	String[] answers = new String[20];
	String[] personality = new String[4];

	int judging = 0;
	int perceptive = 0;

	int thinking = 0;
	int feeling = 0;

	int sensing = 0;
	int intuitive = 0;

	int extrovert = 0;
	int introvert = 0;

	System.out.print("What is your name? ");
	String response = input.nextLine();

	for (int question = 0; question < questions.length; question += 4) {
		System.out.print(questions[question][0]);
		System.out.print(questions[question][1]);

		System.out.println("\nSelect option A or B");
		String options = input.nextLine();

		if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
			if (options.equalsIgnoreCase("A")) {
				answers[question] = questions[question][0];
				extrovert++;
			}

			else {
				answers[question] = questions[question][1];
				introvert++;
			}
		} 

		else {
			System.out.println("you entered something else, enter A or B\n");
			question -= 4;
		}
	}

	if (extrovert > introvert) {
		personality[0] = "E";
	} else {
		personality[0] = "I";
	}














	for (int question = 1; question < questions.length; question += 4) {
		System.out.print(questions[question][0]);
		System.out.print(questions[question][1]);

		System.out.println("\nSelect option A or B");
		String options = input.nextLine();

		if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
			if (options.equalsIgnoreCase("A")) {
				answers[question] = questions[question][0];
				sensing++;
			}

			else {
				answers[question] = questions[question][1];
				intuitive++;
			}
		} 

		else {
			System.out.println("you entered something else, enter A or B\n");
			question -= 4;
		}
	}

	if (sensing > intuitive) {
		personality[1] = "S";
	} else {
		personality[1] = "N";
	}














	for (int question = 2; question < questions.length; question += 4) {
		System.out.print(questions[question][0]);
		System.out.print(questions[question][1]);

		System.out.println("\nSelect option A or B");
		String options = input.nextLine();

		if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
			if (options.equalsIgnoreCase("A")) {
				answers[question] = questions[question][0];
				thinking++;
			}

			else {
				answers[question] = questions[question][1];
				feeling++;
			}
		} 

		else {
			System.out.println("you entered something else, enter A or B\n");
			question -= 4;
		}
	}

	if (thinking > feeling) {
		personality[2] = "T";
	} else {
		personality[2] = "F";
	}












	for (int question = 3; question < questions.length; question += 4) {
		System.out.print(questions[question][0]);
		System.out.print(questions[question][1]);

		System.out.println("\nSelect option A or B");
		String options = input.nextLine();

		if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
			if (options.equalsIgnoreCase("A")) {
				answers[question] = questions[question][0];
				judging++;
			}

			else {
				answers[question] = questions[question][1];
				perceptive++;
			}
		} 

		else {
			System.out.println("you entered something else, enter A or B\n");
			question -= 4;
		}
	}

	if (judging > perceptive) {
		personality[3] = "J";
	} else {
		personality[3] = "P";
	}






	System.out.println(Arrays.toString(personality));









}


}