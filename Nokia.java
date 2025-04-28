import java.util.Scanner;
public class Nokia{
public static void main(String [] args){

Scanner sc = new Scanner (System.in);

System.out.println("""
List of menu functions
1. Phone book
2. Message
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profile
13. Sim services
		""");
int phoneBook = sc.nextInt();
switch(phoneBook){
case 1: System.out.println ("""
Phone book
1. Search
2. service Nos
3. Add name
4. Erase
5. Edit
6. Assign tone
7. Send b'Card
8. Options
9. Speed dials
10. Voice tag
""");
System.out.println("Phone book");
}
int search = sc.nextInt();
switch(search){ // switch phone opening brace;
case 1:  System.out.println("Search");break;

case 2:  System.out.println("Service Nos");break;

case 3:  System.out.println("Add name");break;

case 4:  System.out.println("Erase");break;

case 5:  System.out.println("Edit");break;

case 6:  System.out.println("Assign tone");break;

case 7:  System.out.println("Send b'Card");break;

case 8: String options = """
	Options
	1. Type of view
	2. Memory status
		""";
System.out.println("Options");
	int option = sc.nextInt();
	switch (option){
	case 1:  System.out.println("Type of view");break;

	case 2:  System.out.println("Memory status");break;

	default: System.out.println("invalid options");break;
}
case 9:  System.out.println("Speed dials");break;

case 10:  System.out.println("Voice tag");break;

default: System.out.println("Invalid input");

break;
} 	// switch phone closing brace;


int message = sc.nextInt();
switch(message){	//switch msg opening brace;
case 2: System.out.println(""" 	
	Messages
	1. Write message
	2. Inbox
	3. Outbox
	4. Picture message
	5. Templates
	6. Smileys
	7. Message setting
	8. Info service
	9. Voice mailbox number
	10. Service command editor
		""");
System.out.println("Messages");
}  	// switch msg closing brace;
int messages = sc.nextInt();
switch(messages){ 	// switch msgs opening brace;
case 1:  System.out.println("Write message");break;

case 2:  System.out.println("Inbox");break;

case 3:  System.out.println("Outbox");break;

case 4:  System.out.println("Picture message");break;

case 5:  System.out.println("Templates");break;

case 6:  System.out.println("Smileys");break;

case 7: System.out.println("""
	Message settings
	1. Set 1
	2. Common
			""");
System.out.println("message settings");
int mSetting = sc.nextInt();
switch(mSetting){ //switch messages setting opening brace

case 1:  System.out.println("Message center number");break;

case 2:  System.out.println("Message sent as");break;

case 3:  System.out.println("Message validity");break;
	
default:  System.out.println("Invalid input");break;

} 	// switch message setting closing brace;
System.out.println("common");
int common = sc.nextInt();
switch(common){ 	// switch coomon opening brace
case 1:  System.out.print("Delivery reports");break;

case 2:  System.out.println("Reply via same center");break;

case 3:  System.out.println("Character support");break;

default:  System.out.println("Invalid input");break;

}	//switch common closing brace;

} 	//switch msgs closing race


int chat = sc.nextInt();
switch(chat){
case 3: System.out.println("Chat"); break;
}

int callRegister = sc.nextInt();
switch(callRegister){ 	//call register opening brace
case 4: System.out.println("""
Call register
1. Missed calls
2. Received calls
3. Dialled calls
4. Erase recent call lists
5. Show call duration
6. Show call lost
7. Call cost settings
8. Prepaid cedit
""");
System.out.println("Call register");
} // call register closing brace

int missedCalls = sc.nextInt();
switch(missedCalls){	//missedCall opening brace
case 1:  System.out.println("Missed calls");break;

case 2:  System.out.println("Received calls");break;

case 3:  System.out.println("Dialled calls");break;

case 4:  System.out.println("Erase recent call lists");break;

case 5: System.out.println("""
Show call duration
1. Last call duration
2. All calls duration
3. Received calls duration
4. Dialled call duration
5. Clear timers
"""); 

System.out.println("Call duration");

int calls = sc.nextInt();
switch(calls){
case 1:  System.out.print("Last call duration");break;

case 2:  System.out.print("All calls duration");break;

case 3:  System.out.print("Received calls duration");break;

case 4:  System.out.print("Dialled calls duration");break;

case 5:  System.out.print("Clear timer");break;

default:  System.out.print("Invalid input");break;
}

case 6: System.out.println ("""
Show call cost
1. List call cost
2. All call cost
3. Clear counters
""");

int callCost = sc.nextInt();
switch (callCost){
case 1:  System.out.print("Last call cost");break;

case 2:  System.out.print("All call cost");break;

case 3:  System.out.print("Clear counters");break;

default:  System.out.print("Invalid input");break;

}
case 7: System.out.println("""
Call cost setting
1. Call cost limit
2. Show costs in
""");
int costSetting = sc.nextInt();
switch(costSetting){
case 1: { System.out.print("Call cost limit");break;
}
case 2: { System.out.print("Show cost in");break;
}
default: { System.out.print("Invalid input");break;
}
case 8: { System.out.print("Prepaid credit");break;
}
}
}	//missedCalls closing brace

int tones = sc.nextInt();
switch (tones){
case 5: System.out.println("""
Tones
1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tone
7. Warning and game tone
8. Vibrating alert
9. Screen saver
""");
 System.out.println("Tones");break;
}
int ring = sc.nextInt();
switch(ring){ 	//switch ring opening braces
case 1:  System.out.println("Ringing tone");break;

case 2:  System.out.println("Ringing volume");break;

case 3:  System.out.println("Incoming call alert");break;

case 4:  System.out.println("Composer");break;

case 5:  System.out.println("Message alert tone");break;

case 6:  System.out.println("Keypad tone");break;

case 7:  System.out.println("Warning and game tone");break;

case 8:  System.out.println("Vibrating alert");break;

case 9:  System.out.println("Screen saver");break;

default:  System.out.println("Invalid input");break;

}	// switch ring closing braces

int setting = sc.nextInt();
switch (setting){
case 6: System.out.println("""
Setting
1. Call setting
2. Phone setting
3. Security
4. Restore factory settig
""");
System.out.println("Setting");break;
}
int callSet = sc.nextInt();
switch (callSet){
case 1: System.out.println("Automatic redial");break;
case 2: System.out.println("Speed dialling");break;
case 3: System.out.println("Call waiting options");break;
case 4: System.out.println("One number sending");break;
case 5: System.out.println("Phone line in use");break;
case 6: System.out.println("Automatic answer");break;
}  //switch callSet closing brace
int phoneSet = sc.nextInt();
switch (phoneSet){
case 1: System.out.println("Language");break;
case 2: System.out.println("Cell info display");break;
case 3: System.out.println("Welcome note");break;
case 4: System.out.println("Nextwork selection");break;
case 5: System.out.println("Lights");break;
case 6: System.out.println("Confirm sim service action");break;
}
int settingSecurity = sc.nextInt();
switch(settingSecurity){
case 1: System.out.println("Pin code request");break;
case 2: System.out.println("Pin barring service");break;
case 3: System.out.println("Fixed dialling");break;
case 4: System.out.println("closed user group");break;
case 5: System.out.println("Phone security");break;
case 6: System.out.println("Change access codes");break;
}

int restore = sc.nextInt();
switch (restore){
case 4: System.out.println("Restore factory settings");break;
}

int callDivert = sc.nextInt();
switch(callDivert){
case 7: System.out.println("Call divert");break;
}
System.out.println("Call Divert");

int Games = sc.nextInt();
switch(Games){
case 8: System.out.println("Games");break;
}
System.out.println("Games");

int calculator = sc.nextInt();
switch(calculator){
case 9: System.out.println("Calculator");break;
}
System.out.println("Calculator");

int Reminder = sc.nextInt();
switch(Reminder){
case 10: System.out.println("Reminder"); break;
}
System.out.println("Reminder");

int clock = sc.nextInt();
switch (clock){
case 11: System.out.println("""
Clock
1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
""");
System.out.println("Clock");
}

int alarm = sc.nextInt();
switch(alarm){
case 1:  System.out.println("Alarm clock");break;

case 2:  System.out.println("Clock setting");break;

case 3:  System.out.println("Date setting");break;

case 4:  System.out.println("Stopwatch");break;

case 5:  System.out.println("Countdown timer");break;

case 6:  System.out.println("Auto update of date and time");break;

default:  System.out.println("invalid input");break;
}

int profile = sc.nextInt();
switch (profile){
case 12: System.out.println("Profile");break;
}
System.out.println("Profile");


int simService = sc.nextInt();
switch (simService){
case 13: System.out.println("Sim Service");break;

default: System.out.println("Invalid input");
}





}
}