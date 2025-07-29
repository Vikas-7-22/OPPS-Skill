package basic;

import java.util.Scanner;

public class Buffer {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StringBuffer sb1=new StringBuffer("Vikas");
		sb1.append(" Macharla");
		System.out.println("After append: "+sb1);
		sb1.insert(2,",");
		System.out.println("after inserting: "+sb1);
		sb1.delete(2, 3);
        System.out.println("After delete: " + sb1);
        sb1.replace(2,5, "cky");
        System.out.println("After replace: " + sb1);
        sb1.reverse();
        System.out.println("After reverse: " + sb1);
        System.out.println("Buffer capacity: " + sb1.capacity());
		scanner.close();
}
}