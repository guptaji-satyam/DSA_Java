package function;
import java.util.Scanner;
public class EvenCheck {
    public static boolean isEven( int n){
       return n % 2 == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number - ");
        int n =  sc.nextInt();

        if(isEven(n)){
            System.out.println(n + " is even number ");
        } else{
            System.out.println(n +  " is odd number ");
        }
        sc.close();   
    }
}
