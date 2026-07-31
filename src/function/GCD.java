package function;
import java.util.Scanner;
public class GCD { // greatest common devisor of HCF
    public static int printGcd( int a , int b  ){
        int gcd = 1;
        int min = Math.min(a , b);
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b  % i == 0){
                gcd = i;
            }
        }
       return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = sc.nextInt();

        System.out.print("Enter second number = ");
        int b = sc.nextInt();

         System.out.println("GCD = " + printGcd(a, b));
        sc.close();
    }
}



// package function;
// import java.util.Scanner;
// public class GCD {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();


//        while(n1 != n2) { 
//            if(n1>n2) {
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1;
//            }
//        }
//        System.out.println("GCD is : "+ n2);
//    sc.close();
//     }

// }
