import java.util.Scanner;
public class Large{
public static void main (String [] args ){

Scanner input = new Scanner (System.in);

int counter = 1;
int largest = -1_566_787_676 ;
int smallest = 1_566_787_676;

System.out.print("Enter any number or -1 to quit: ");

while(true){
 int first = input.nextInt();

if(first == -1){
break;}// breaks i user enters sentinel value

else if (first != -1){

if(first > largest) {
largest = first;
}
if(first < smallest) {
smallest = first;
}

}
counter++;
}
System.out.printf("The largest number is %d, The smallest number is %d", largest, smallest);




}
}