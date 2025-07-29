package SKILL1;

import java.util.Scanner;
public class Wrapper {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int v= scanner.nextInt();
		Integer i=Integer.valueOf(v);
		double k = scanner.nextDouble();
		Double j=Double.valueOf(k);
		System.out.println("Integer object: "+i);
		System.out.println("Double object: "+j);
		scanner.close();
}
}