package function;

import java.util.Scanner;

public class Greater { 
    public static int greaterValue(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
            return a;
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
            return b;
        } else {
            System.out.println("Both numbers are equal.");
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A = ");
        int a = sc.nextInt();

        System.out.print("Enter the value of B = ");
        int b = sc.nextInt();

        greaterValue(a, b);

        sc.close();
    }
}

// apna college 
// package function;

// import java.util.Scanner;
// public class Solutions {
//    public static int getGreater(int a, int b) {
//       if(a > b) {
//           return a;
//       } else {
//           return b;
//       }
//    }
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       System.out.println(getGreater(a, b));
//       sc.close();
//    }   
// }
