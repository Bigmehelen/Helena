import java.util.Scanner;
public class Factors{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

int count = 1;
System.out.print("Enter a number: ");
int num = input.nextInt();
System.out.print("The factors of the number is: ");

for (count = 1 ; count <= num ; count ++){
if (num % count == 0 )
System.out.printf(" %d ", count);
}



}
}