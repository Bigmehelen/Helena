public class Table{
public static void main(String [] args ){

double counter = 1;
double num = 2;
double sqrt  ;

System.out.println("a     b     pow (a,b)");


while(counter <= 5){
sqrt = Math.pow(counter, num);
int cast = (int) sqrt;
int cast2 = (int) num;
int cast3 = (int) counter;

System.out.printf("%d     %d     %d%n",cast3, cast2, cast );

counter++;
num++;
}








}
}