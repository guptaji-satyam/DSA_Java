package function;
import java.util.Scanner;
public class Voter {
    public static void eligibleVoter(int n){
        if(n >= 18){
            System.out.println("you are eligible for vote ");
        }else{
            System.out.println("you are not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int n = sc.nextInt(); 

        eligibleVoter(n);
        sc.close();
    }
}       


