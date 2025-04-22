import java.util.Scanner;
public class Multiplication{
public static void main(String [] args ){

Scanner input = new Scanner (System.in);

int counter = 1;
int total = 0;

System.out.print("Input a positive integer: ");
int number = input.nextInt();

while (counter <= 12){
total = counter * number;
counter++;
System.out.printf("%d * %d = %d%n", number, counter, total);

}








}
}