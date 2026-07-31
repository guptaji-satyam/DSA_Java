package Basics;

import java.util.Scanner;

public class UserInput {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a's Value -");
        int a = input.nextInt();

        System.out.print("Enter b's Value-");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("the sum of a and b is " + sum);
     input.close();    
    }
       
}
