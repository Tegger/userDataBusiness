import java.util.Scanner;
import java.util.ArrayList;
import java.security.*;
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a;
        String b;
        String c;
        int userInput = 0;
        boolean check = false;

        while (!check) {

            System.out.println("Please enter the number of your selection: ");
            System.out.println("1: Residential");
            System.out.println("2: Business");
            userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.println("Please enter the name of your business: ");
                a = scanner.next();

                System.out.println("Please enter your phone number: ");
                b = scanner.next();
                business(a, b);

                check = true;

            } else if (userInput == 2) {
                System.out.println("Please enter the name of your business: ");
                a = scanner.next();

                System.out.println("Please enter your name: ");
                b = scanner.next();

                System.out.println("Please enter your business' phone number: ");
                c = scanner.next();
                business(a, b, c);
                check = true;

            } else {
                System.out.println("That is not a viable input... ");
            }


        }

    }
    //residential info
    public static void business(String a, String b) {
        System.out.println("Contact Name: " + a);
        System.out.println("Phone Number: " + b);

    }
    //business info
    public static void business(String a, String b, String c) {
        System.out.println("Business Name: " + a);
        System.out.println("Contact Name: " + b);
        System.out.println("Phone Number: " + c);
    }


}
