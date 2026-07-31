package Basics;
import java.util.Scanner;

public class even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        System.out.println("Even numbers till " + n +  " are");

        // for( int i = 0; i<=n; i++){
        //     if(i % 2==0) {
        //         System.out.println(i);
        //     }
        // }
        for( int i = 0; i<=n; i+=2){
            System.out.print(i + " ");
        }
       sc.close();
    }
}
    


    
