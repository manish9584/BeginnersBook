package SimpleInterest;

import javax.swing.*;
import java.util.Scanner;

public class Saving {
    public static void main(String[] args) {

        String account;
        float interest;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account Type: ");
        account = scan.next();
        scan.close();

        if (account == account){
            System.out.println("Saving Account");
        }
        else {
            System.out.println("Account Type is Other");
        }
    }
}
