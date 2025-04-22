import java.util.Scanner;
public class MaxNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
int count;
int max = -2_000_000_000;

System.out.print("Enter Numbers or press 0 to quit: ");

for(count = 1;  ; ){

int num = input.nextInt();
if (num == 0){ break;
} else if (num > max ) {
max = num ;
} else if (num == max){
count++;
}
if (num > max){
count = 1;
} else if (num == max){
count++;
}



}




System.out.print("The Largest number is " + max);
System.out.print("The number of occurence of largest is " + count);








}
}