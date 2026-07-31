package function;
import java.util.Scanner;
public class Triangle {
    public static void printTriangle( int a , int b , int c){
        if (a + b > c && b + c > a && c + a > b){
            System.out.println(" It is a triangle ");
        }else {
            System.out.println("It is not a triangle ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a = sc.nextInt();

        System.out.print("Enter value of b = ");
        int b = sc.nextInt();
        
        System.out.print("Enter value of c = ");
        int c = sc.nextInt();

        printTriangle(a , b , c);
        sc.close();
    }
}
