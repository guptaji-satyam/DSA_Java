package Array;



public class PrintArray {
    public static void main(String[] args) {

        // first method for initialisation of array

        int[] arr = {15,25,30,8,7,6};

       // System.out.println(arr.length); or

       int n = arr.length; // index 0 to n-1

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+ " ") ;
        }
   
    }
}
