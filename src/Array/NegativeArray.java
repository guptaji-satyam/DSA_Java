package Array;

import java.util.Scanner;

public class NegativeArray {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int [] arr = new int[size]; 
        System.out.print("ENter elements of array : ");

        //input 
        for(int i = 0; i < size; i++ ){
            arr[i] = sc.nextInt();
        }

        //print negative value
        for(int i = 0; i<size; i++){
          if(arr[i]<0){
            System.out.print(arr[i] + " ");
          }
        }
        sc.close();
    }
}

