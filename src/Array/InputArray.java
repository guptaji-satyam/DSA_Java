package Array;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sc.nextInt();

        int [] arr = new int[size]; // by default it stores 0 inside array(element of array is 0 at all index if we do not input elements)
        System.out.print("ENter elements of array : ");
        //input 
        for(int i = 0; i < size; i++ ){
            arr[i] = sc.nextInt();
        }

        //output
        for(int i = 0; i<size; i++){
            // System.out.print(arr[i] + " ");
            System.out.print(2*arr[i] + " "); // double the element
        }
        sc.close();
    }
          
}

