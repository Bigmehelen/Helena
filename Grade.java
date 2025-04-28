
import java.util.Scanner;
public class Grade{
public static void main(String [] args){

Scanner input = new Scanner (System.in);
int count = 1;
int countA = 0;
int countB = 0;
int countC = 0;
int countD = 0;
int countF = 0;
int countg = 0;

System.out.print("Enter valid grades from 1 - 100: ");

while (count <= 10){

int validGrade = input.nextInt();

if (validGrade < 0 || validGrade > 100){
System.out.println("Invalid Grades");
countg++;
continue;

}

if (validGrade >= 0 && validGrade <= 100 ){
 count++;}


switch(validGrade / 10){

case 8,9,10: {System.out.println("Grade A"); 
countA++;
break;
}

case 7: {System.out.println("Grade B"); 
countB++;
break;
}

case 6: {System.out.println("Grade C"); 
countC++;
break;
}

case 5:{ System.out.println("Grade D"); 
countD++;
break;
}

case 0,1,2,3,4 :{ System.out.println("Grade F"); 
countF++;
break;
}
}


}
System.out.println("Number of A is " + countA);
System.out.println("Number of B is " + countB);
System.out.println("Number of C is " + countC);
System.out.println("Number of D is " + countD);
System.out.println("Number of F is " + countF);
System.out.println("Number of Invalid grade is " + countg);



}
}








/*if (userInput < 1 && userInput > 13){
System.out.print("error");
}



case 1: { System.out.print("Search");break;
}
case 2: {System.out.print("Service Nos");break;
}
case 3: { System.out.print("Add name"); break;
}
case 4: { System.out.print("Erase"); break;
}
case 5: { System.out.print("Edit"); break;
}
case 6: { System.out.print ("Assign tone");break;
}
case 7: { System.out.print("Send b'card");break;
}
case 8: { System.out.print("Options");break;
switch(8){
case 1: { System.out.print("Type of view");break;
}
case 2: { System.out.print("Memory status");break;
}
}
}
case 9: { System.out.print("Speed dials");break;
}
case 10: { System.out.print("Voice tags");break;
}*/
