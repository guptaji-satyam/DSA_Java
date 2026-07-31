package function;
import java.util.Scanner;
public class Power {
    public static int calculatePower(int x , int n) {
        int result = 1;
        for (int i = 1; i <= n; i++){ // for n = negative we use i >= n
          result = result * x;  
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X = ");
        int x = sc.nextInt();

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        
        System.out.println(x + " raised to power " + n + " is = " + calculatePower(x, n));
        sc.close();
        }
}
