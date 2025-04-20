import java.util.Scanner;
public class Factorial{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

int counter = 1;
long factorial = 1;

System.out.print("Enter a number: ");
int number = input.nextInt();

if (number < 0) {
System.out.print("Input a positive integer: ");
number = input.nextInt();
}

while(counter <= number){
factorial = factorial * counter ;
counter++;
}
System.out.printf("%d%n", factorial);









}
}