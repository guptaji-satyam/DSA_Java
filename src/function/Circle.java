package function;
import java.util.Scanner;
public class Circle {
    public static Double printCircumference(Double r ){
        return 2 * 3.14 *r ;//circumference;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enetr the radius the circle = ");
        Double r = sc.nextDouble();

        //int circumference = printCircumference(r);
        System.out.println("circumference of a circle is = " + printCircumference(r));
        sc.close();
    }
}

