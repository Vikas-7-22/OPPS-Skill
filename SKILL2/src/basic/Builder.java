package basic;

import java.util.Scanner;

public class Builder {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.print("Enter first string: ");
	        StringBuilder sb1 = new StringBuilder(scanner.nextLine());

	        System.out.print("Enter second string: ");
	        StringBuilder sb2 = new StringBuilder(scanner.nextLine());
	        System.out.println("First StringBuilder: " + sb1);
	        System.out.println("Second StringBuilder: " + sb2);
	        sb2.append(sb1);
	        System.out.println("After appending :");
	        System.out.println("First StringBuilder: " + sb1); 
	        System.out.println("Second StringBuilder: " + sb2);
scanner.close();
}
}