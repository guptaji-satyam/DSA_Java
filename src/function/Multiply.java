package function;
import java.util.Scanner;

public class Multiply {

    public static int calculateProduct( int a , int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of a - " );
        int a = sc.nextInt();

        System.out.print("Enter value of b - " );
        int b = sc.nextInt();

        System.out.println(" Product of a and b is "+ calculateProduct( a, b));
        sc.close();
    }
}


