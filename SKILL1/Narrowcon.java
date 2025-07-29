package SKILL1;

import java.util.Scanner;

public class Narrowcon {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int a;
		a=scanner.nextInt();
		byte j=(byte)a;
		System.out.println("Integer: "+a);
		System.out.println("Byte: "+j);
		scanner.close();
}
}