package Pattern;

public class MIrrorhalfpyramid {
    public static void main(String[] args) {
        int n = 5;

        //outer loop for rows
        for(int i = n; i>=1 ; i-- ){

            // inner loop for space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //inner loop for star
            for( int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

