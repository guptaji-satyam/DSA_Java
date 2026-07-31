package Basics;

import java.util.Scanner;

public class SwitchCase {
     public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER BETWEEN 1-4= ");
        int num = sc.nextInt();

        switch(num) {
            case 1 :
                 System.out.println("YOU BOOKED VANILLA FLAVOUR");
                break;
            case 2 :
                 System.out.println("YOU BOOKED CHOCOLATE FLAVOUR");
                break;
            case 3 :
                 System.out.println("YOU BOOKED BUTTERSCOTCH FLAVOUR");
                break;
            case 4 :
                 System.out.println("YOU BOOKED STRAWBERRY FLAVOUR");
                break;
            default :
                 System.out.println("INVALID CHOICE ");
        }
        sc.close();
    }
}
