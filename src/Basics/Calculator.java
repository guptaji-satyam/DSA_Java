package Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();

        System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Modulus");

        System.out.print("Enter your choice (1-5) = ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Addition: " + (num1+num2));
            break;
            case 2:
                System.out.println("Subtraction: " + (num1-num2));      
            break;
            case 3:
                System.out.println("Multiplication: " + (num1*num2));       
            break;
            case 4:
                System.out.println("Division: " + (num1/num2));
            break;
            case 5:
                System.out.println("Modulus: " + (num1%num2));
            break;
            default:
                System.out.println("INVALID CHOICE ! PLEASE ENTER BETWEEN 1-5");

        }
        sc.close();
    }
}
