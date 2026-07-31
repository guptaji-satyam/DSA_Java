package function;
import java.util.Scanner ;
public class Myname {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a name - ");
        String name = sc.next();
        
        printMyName(name); // function ko call kiya 
        sc.close();
    }

}
