public class Tabular{
public static void main(String [] args){

double count;



System.out.println("N      N2      N3      N4");

for(count = 1; count <= 5; count++){

double a = Math.pow (count, 2);
int result1 = (int) a;

double b = Math.pow (count, 3);
int result2 = (int) b;

double c = Math.pow (count, 4);
int result3 = (int) c;

int castCount = (int) count;


System.out.printf("%d\t%d\t%d\t%d%n", castCount, result1, result2, result3);

}





}
}