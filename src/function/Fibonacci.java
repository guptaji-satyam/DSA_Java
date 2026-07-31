package function;
import java.util.Scanner;
public class Fibonacci {
    public static void printFibonacci(int n ){
        
        int first = 0 , second = 1;

        System.out.println(first);
        System.out.println(second);

        for(int i = 3; i<= n; i++){
         
            int next = first + second;
                System.out.println(next);
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
           
        printFibonacci(n);

        sc.close();
    }
}

// import java.util.Scanner;

// public class Fibonacci {

//     public static void printFibonacci(int n) {
//         int first = 0, second = 1;

//         for (int i = 1; i <= n; i++) {
//             System.out.print(first + " ");

//             int next = first + second;
//             first = second;
//             second = next;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         printFibonacci(n);

//         sc.close();
//     }
// }