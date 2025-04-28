import java.util.Scanner;
public class TwoHighestNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int count = 1;
int highest = -2_000_000_000;
int secondHighest = -2_000_000_000;
String highestName = " ";
String secondHighestName = " "; 

System.out.println("Enter no of Students :  ");
int numOfStudent = input.nextInt();

while (count <= numOfStudent){
 
System.out.print("Enter Student name and Student score: ");
String name = input.next();
int userInput = input.nextInt();

if(userInput > highest){

secondHighest = highest;
secondHighestName = highestName;

highest = userInput;
highestName = name;

}
else
if(userInput > secondHighest){
secondHighest = userInput;
secondHighestName = name;
}

count++;
}



System.out.printf("Student highest Name %s and Score %d%n", highestName, highest );
System.out.printf("Student second highest Name %s and second highest Score %d ", secondHighestName , secondHighest);


}
}