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
	{"A. firm, tend to criticize, hold the line", "\t\tB. gentle, tend to appreciate, conciliate"},
	{"A. regulated, structured", "\t\tB. Easy-going, live and let live"},
	{"A. External, communicative, express yourself", "\t\tB. Internal, reticent, keep to yourself"},
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
	String userResponse = input.nextLine();

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
		System.out.println("\nThe number of A entered:" + extrovert);
		System.out.println("The number of B entered:" + introvert);
		
			if(extrovert > introvert){
				System.out.print("You are an Extrovert\n");
			}
			else{
				System.out.print("You are an Introvert\n");	
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
		System.out.println("\nThe Number of A entered:" + sensing);
		System.out.println("The Number of B entered:" + intuitive);

			if(sensing > intuitive) {
				System.out.print("You are Sensing\n");
			}
			else{
				System.out.print("You are Intuitive\n");	
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
		System.out.println("\nThe number of A entered:" + thinking);
		System.out.println("The number of B entered:" + feeling);

			if(thinking > feeling){
				System.out.print("You are a Thinker\n");
			}
			else{
				System.out.print("You are a Emotional\n");	
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
		System.out.println("\nThe number of A entered:" + judging);
		System.out.println("The number of B entered:" + perceptive);

			if(judging > perceptive){
				System.out.print("You are Judging\n");
			}
			else{
				System.out.print("You are Perceptive\n");	
			}

	if (judging > perceptive) {
		personality[3] = "J";
	} else {
		personality[3] = "P";
	}




	System.out.println(Arrays.deepToString(personality));

	String finalFinding = "";
	for(String result: personality){
		System.out.print(result);
		finalFinding += result;
	}	

	System.out.printf("Hello %s%n", userResponse);

	if(finalFinding.equals("ENFJ")){
                System.out.println("Protagonist: This is a personality type with the Extroverted, Intuitive, Feeling, and Judging traits. You are charismatic and inspiring leaders, often driven to help others realize their potential.");
	}
	else if(finalFinding.equals("ENTJ")){
		System.out.println("Commander: This is a personality type with the Extroverted, Intuitive, Thinking, and Judging traits. You are Bold and imaginative, you are strong-willed leaders who enjoy organizing and directing people and projects.");
	}
	else if(finalFinding.equals("INFP")){
                System.out.println("Mediator: This is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. Idealistic and loyal to their values, You are driven by your beliefs and desire to make the world a better place.");
	}
	else if(finalFinding.equals("INTJ")){
                System.out.println("Architect: This is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. You are a thoughtful tactician that loves perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
         }
         else if(finalFinding.equals("ESFJ")){                
		System.out.println("Consul: This is a personality type with the Extroverted, Sensing, Feeling, and Judging traits. Caring and social, You have a strong sense of duty and are eager to help others.");
         }
         else if(finalFinding.equals("ESTJ")){
                System.out.println("Executive: This is a personality type with the Extroverted, Sensing, Thinking, and Judging traits. Organized and driven, you focus on results and managing tasks efficiently.");
         }
	else if(finalFinding.equals("ISFP")){
                System.out.println("Adventurer: This is a personality type with the Introverted, Sensing, Feeling, and Prospecting traits. Creative and spontaneous, you value freedom and often express themselves through art and other forms of creativity.");
	}
	else if(finalFinding.equals("ISTP")){
                System.out.println("Virtuoso: This is a personality type with the Introverted, Sensing, Thinking, and Prospecting traits. You tend to have an individualistic mindset, pursuing goals without needing much external connection. you engage in life with inquisitiveness and personal skill, varying their approach as needed.");
	}
	else if(finalFinding.equals("ENFP")){
                System.out.println("Campaigner: This is a personality type with the Extroverted, Intuitive, Feeling, and Prospecting traits. Enthusiastic and creative, you have a strong sense of possibility and are driven by their values and ideas.");
	}
        else if(finalFinding.equals("ENTP")){
                System.out.println("Debater: This is a personality type with the Extroverted, Intuitive, Thinking, and Prospecting traits. Quick-witted and clever, you enjoy the challenge of ideas and often think outside the box.");
        }
        else if(finalFinding.equals("INTP")){
                System.out.println("Logician: This is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. You are a flexible thinker that enjoys taking an unconventional approach to many aspects of life. You often seek out unlikely paths, mixing willingness to experiment with personal creativity.");
	}
        else if(finalFinding.equals("ISFJ")){
                System.out.println("Defender: This is a personality type with the Introverted, Sensing, Feeling, and Judging traits. You are Warm and conscientious, You have a strong sense of duty and take pride in their responsibilities.");
	}
        else if(finalFinding.equals("ISTJ")){
                System.out.println("Logistician: This is a personality type with the Introverted, Sensing, Thinking, and Judging traits. You tend to be reserved yet willful, with a rational outlook on life. You compose your actions carefully and carry them out with methodical purpose.");
	}
        else if(finalFinding.equals("ESFP")){
                System.out.println("Entertainer: This is a personality type with the Extroverted, Sensing, Feeling, and Prospecting traits. You are Outgoing and spontaneous, you enjoy life in the moment and often seek new experiences.");
        }
        else if(finalFinding.equals("ESTP")){
                System.out.println("Entrepreneur: This is a personality type with the Extroverted, Sensing, Thinking, and Prospecting traits. you are Bold and perceptive, You take action to make things happen and enjoy living on the edge.");
	}
        else if(finalFinding.equals("INFJ")){
                System.out.println("Advocate: This is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. You tend to approach life with deep thoughtfulness and imagination. Your inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
	}
        else{
                System.out.println("Your personality type is not recognized.");
        }








}


}