package basic;
import java.util.Scanner;

public class Monthlybills {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        int bill = 0;

        System.out.println("No. of Units: " + units);

        if (units <= 50) {
            bill = units * 2;
        } else if (units >= 51 && units <= 100) {
            bill = units * 3;
        } else if (units >= 101 && units <= 300) {
            bill = (units * 5) + 100;
        } else if (units >= 301 && units <= 450) {
            bill = (units * 6) + 200;
        } else {
            bill = (units * 8) + 250;
        }

        System.out.println("Bill: " + bill + " Rs");
        scanner.close();
    }
}
