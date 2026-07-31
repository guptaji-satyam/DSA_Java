package Pattern;
import java.util.Scanner;
public class Numberhalfpyramid { // Hlaf pyramid with number 
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number - ");
        int n = sc.nextInt();
        
        // outetr loop
        for (int i = 1; i<=n ; i++){
            // inner loop 
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");   // j ke baad + lagane se or usle baad inverted comma me space space dene se numbers ke beech me jagha (space) aa jati hai 
            }
            System.out.println();
        }
        sc.close();
    }

}