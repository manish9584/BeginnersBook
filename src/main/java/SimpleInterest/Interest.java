package SimpleInterest;
import java.util.Scanner;
public class Interest {

    public static void main(String[] args) {
        float p, r, t, simple;

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the principal: ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of Interest: ");
        r = scan.nextFloat();
        System.out.print("Enter the Time Period: ");
        t = scan.nextFloat();
        scan.close();

        simple = (p*r*t)/100;

        System.out.println("Final Amount: " + simple);

    }
}
