package BeginnersBook;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        a = scan.nextInt();
        {
            if (a % 2 == 0)
                System.out.println("Number is even: ");
            else
                System.out.println("Number is odd: ");
        }
    }
}
