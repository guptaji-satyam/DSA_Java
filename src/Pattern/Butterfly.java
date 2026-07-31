package Pattern;

public class Butterfly {
    public static void main(String[] args) {

    int n =  8;

        // outer loop for upper  half 

        for(int i = 1; i<=n; i++){
            // inner loop -> star 1st part
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
 
            // inner loop -> space 
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }

            // 2nd part -> star 
            for( int j =  1; j<=i; j++){    
                System.out.print("*");
            }
            System.out.println();
            
        }

        // lower half 
        for(int i = n; i>=1; i--){
            // inner loop -> star 1st part
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
 
            // inner loop -> space 
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }

            // 2nd part -> star 
            for( int j =  1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
}
