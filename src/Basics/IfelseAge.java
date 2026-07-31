package Basics;

import java.util.Scanner;

public class IfelseAge {
       public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = sc.nextInt();

        if (age <=18) {
            System.out.println("you are minor");
        }else{
            System.out.println("you are adult");
        }
    
    sc.close();
}
}
