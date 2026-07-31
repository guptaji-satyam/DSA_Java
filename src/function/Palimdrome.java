package function;
import java.util.Scanner;
public class Palimdrome {
    public static boolean isPalindrome(int n ){
        int original = n;

        int reverse = 0;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        if (original == reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        if (isPalindrome(n)){
            System.out.println(n + " is palindrome ");
        }else{
            System.out.println(n +"is not palindrome ");
        }
        
        
        sc.close();

    }
}
