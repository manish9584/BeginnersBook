package BeginnersBook;

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of Manish: ");
        a = scan.nextInt();
        System.out.println("Enter value of Bhavin: ");
        b = scan.nextInt();
        scan.close();
        {
            sum = a + b;
            System.out.println("Total is " + sum);
        }
    }
}
