package Pattern;
//  import java.util.Scanner;
public class Rotatedinvertedpyramid { // Inverted Half pyramid( rotated by 180 degree)
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter the value of n - ");
    //     int n = sc.nextInt();
      
      
        int n = 4;
        
        for( int i = 1; i<=n; i++){
            // inner loop -> space print
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            // inner loop -> print star 
            for(int j = 1; j<=i; j++){
                System.out.print ("*");
            }
            System.out.println();
        }

        // sc.close();
    }

}
