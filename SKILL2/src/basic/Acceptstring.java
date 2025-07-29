package basic;

import java.util.Scanner;

public class Acceptstring {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char a[]= {'V','i','k','a','s'};
		String input=scanner.nextLine();
		System.out.println("array as String: "+new String(a));
		System.out.println("Input String: "+input);
		scanner.close();
		
}
}