package basic;
import java.util.Scanner;
public class Fibonacci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter no of terms n: ");
	        int n = scanner.nextInt();
	        int first = 0, second = 1;
	        System.out.println("Fibonacci Series " + n + " terms:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }

	        scanner.close();
	    }
	}

