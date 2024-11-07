import java.util.Scanner;

public class Nokia{
	public static void main(String [] args){	
	Scanner input = new Scanner(System.in);

	System.out.print("Select a number on the menu? please pick an option: MENU\n\n1.Phone book\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM services\n");
	int selection = input.nextInt();
	
	switch(selection){
	case 1:
	System.out.println("Phone Book\n 1. Search\n2.Service Nos.\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags");
	int phoneBook = input.nextInt();

	switch(phoneBook){  
		case 1: 
		System.out.println("Search of contact"); break;
		case 2: 
		System.out.println("Service Nos."); break;
		case 3:
		System.out.println("Add name"); break;
		case 4:
		System.out.println("Erase name"); break;
		case 5:
		System.out.println("Edit"); break;
		case 6:
		System.out.println("Assign Tone"); break;
		case 7:
		System.out.println("Send b'card"); break;
		case 8:
		System.out.println("options\n 1. Type of view\n 2. Memory status");
			int options = input.nextInt();
			
			switch(options){
			case 1:
			System.out.println("Type of view"); break;
			case 2:
			System.out.println("Memory status"); break;
			}
		break; 
		case 9:
		System.out.println("Speed dials"); break;
		case 10:
		System.out.println("Voice tags"); 
		break;
	}
	break;

	case 2:
	System.out.println("Message\n 1. Write messages\n2. Inbox\n3. Outlook\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor.");
	int messages = input.nextInt();
	
	switch(messages){
		case 1:
		System.out.println("Write messages"); break;
		case 2:
		System.out.println("Inbox"); break;
		case 3:
		System.out.println("Outbox"); break;
		case 4:
		System.out.println("Picture messages"); break;
		case 5:
		System.out.println("Templates"); break;
		case 6:
		System.out.println("Smileys"); break;
		case 7:
		System.out.println("Message settings\n1. Set 1\n2. Common"); 
			int option = input.nextInt();
			
			switch(option){
				case 1:
				System.out.println("1. Message centre number\n2. Messages sent as\n3. Message validity"); break;
				case 2:
				System.out.println("1. Delivery reports\n2. Reply via same centre\n3. Character support ");
			}
			break;
		case 8:
		System.out.print("Info service"); break;
		case 9:
		System.out.print("Voice mailbox number"); break;
		case 10:
		System.out.print("Service command editor"); break;
	}

	case 3:
	System.out.println("Chat"); break;

	case 4:
	System.out.println("Call register\n1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call list\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit");
	int callRegister = input.nextInt();
		
	switch(callRegister){
		case 1:
		System.out.println("Missed calls"); break;
		case 2:
		System.out.println("Received calls"); break;
		case 3:
		System.out.println("Dialled numbers"); break;
		case 4:
		System.out.println("Erase recent call lists"); break;
		case 5:
		System.out.println("Show call duration\n1. last call duration\n2. All calls duration\n3. Received calls' duration\n4. Dialled calls duration\n5. Clear timers");
		int showCallDuration = input.nextInt();
			switch(showCallDuration){
				case 1:
				System.out.println("last call duration"); break;
				case 2:
				System.out.println("All calls' duration"); break;
				case 3:
				System.out.println("Received calls' duration"); break;
				case 4:
				System.out.println("Dialled calls' duration"); break;
				case 5:
				System.out.println("Clear timers"); break;
			}
		break;
		case 6:
		System.out.println("Show call costs\n1. Last call ");
		int showCallCosts = input.nextInt();
			switch(showCallCosts){
				case 1:
				System.out.println("Last call cost"); break;
				case 2:
				System.out.println("All calls' cost"); break;
				case 3:
				System.out.println("Clear counters"); 
			}
		break;
		case 7:
		System.out.println("Call cost settings\n1. Call cost limit\n2. Show cost in");
		int callCostSettings = input.nextInt();

			switch(callCostSettings){
				case 1:
				System.out.println("Call cost limit"); break;
				case 2:
				System.out.println("Show cost in");
			}
		break;
		case 8:
		System.out.print("Prepaid credit"); break;
	}

	case 5:
	System.out.println("Tones\n 1. Ringing Tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad Tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver\n");
	int tones = input.nextInt();

	switch(tones){  
		case 1: 
		System.out.println("Ringing tone"); break;
		case 2: 
		System.out.println("Ringing volume"); break;
		case 3:
		System.out.println("Incoming call alert"); break;
		case 4:
		System.out.println("Composer"); break;
		case 5:
		System.out.println("Message alert tone"); break;
		case 6:
		System.out.println("Keypad tones"); break;
		case 7:
		System.out.println("Warning and game tones"); break;
		case 8:
		System.out.println("Vibrating alert"); break;
		case 9:
		System.out.println("Screen saver"); break;
	}

	case 6:
	System.out.println("Settings\n 1. Call setting\n2. Phone settings\n3. Security settings\n4. Restore factory settings\n");
	int settings = input.nextInt();
			switch(settings){  
				case 1: 
				System.out.println("Call settings\n1. Automatic redial\n2. Speed dailing\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer.");
				int callSettings = input.nextInt();

					switch(callSettings){
						case 1:
						System.out.println("Automatic Redial"); break;
						case 2:
						System.out.println("Speed dialling"); break;
						case 3:
						System.out.println("Call waiting options"); break;
						case 4:
						System.out.println("Own number sending"); break;
						case 5:
						System.out.println("Phone in use"); break;
						case 6:
						System.out.println("Automatic answer");
					}
					break;
				case 2: 
				System.out.println("Phone setting\n 1.Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions");
	int phoneSettings = input.nextInt();
				switch(phoneSettings){
					case 1:
					System.out.println("Language"); break;
					case 2:
					System.out.println("Cell info display"); break;
					case 3:
					System.out.println("Welcome note"); break;
					case 4:
					System.out.println("Network selection"); break;
					case 5:
					System.out.println("lights"); break;
					case 6:
					System.out.println("Confirm SIM service actions");
				}
				break;

				case 3:
				System.out.println("Security settings\n1. Pin code request\n2. Call barring service\n3. Fixed dialling\n4. CLosed user group\n5. Phone security\n6. Change access codes");	
				int securitySettings = input.nextInt();

				switch(securitySettings){
					case 1:
					System.out.println("PIN code request"); break;
					case 2:
					System.out.println("Call barring service"); break;
					case 3:
					System.out.println("Fixed dialling"); break;
					case 4:
					System.out.println("Closed user group"); break;
					case 5:
					System.out.println("Phone security"); break;
					case 6:
					System.out.println("Change access codes"); break;

				}
		}
	case 7:
	System.out.println("Call divert"); break;

	case 8:
	System.out.println("Games"); break;

	case 9:
	System.out.println("Calculator"); break;

	case 10:
	System.out.println("Reminder"); break;

	case 11:
	System.out.println("Clock\n1. Alarm clock\n2. Clock settings\n3. Date settting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time.");
	int clock = input.nextInt();
		switch(clock){
				case 1:
				System.out.println("Alarm clock"); break;
				case 2:
				System.out.println("Clock settings"); break;
				case 3:
				System.out.println("Date setting"); break;
				case 4:
				System.out.println("Stopwatch"); break;
				case 5:
				System.out.println("Countdown timer"); break;
				case 6:
				System.out.println("Auto update of date and time"); break;
		}
	case 12:
	System.out.println("Profiles"); break;

	case 13:
	System.out.println("SIM services");break;



	}

	}
}