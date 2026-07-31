package function;
import java.util.Scanner;
public class Average{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
            System.out.print("Enter value of a - ");
            int a = sc.nextInt();
            System.out.print("Enter value of b - ");
            int b = sc.nextInt();
            System.out.print("Enter value of c - ");
            int c = sc.nextInt();
        int average = (a + b + c) /3 ;
        System.out.println("Average of a , b , c is "+average);
        sc.close();
    }
}