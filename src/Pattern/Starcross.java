package Pattern;

import java.util.Scanner;

public class Starcross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n - ");
        int n = sc.nextInt();

        if (n % 2 != 0){
            for(int i = 1 ;i<=n; i++){
                for(int j = 1; j<= n ; j++ ){

                    if(i == j || i + j == (n + 1) ){
                        System.out.print("*" + " ");
                    }else{ 
                        System.out.print("  "); // use double space for proper alignment
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Enter any odd number !");
        }
        sc.close();
    }
}
