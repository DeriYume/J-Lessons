package uni.fmi.bachelors;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input A and B: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println("A * B = " + (a * b));
		System.out.println("A / B = " + (a / b));
		System.out.println("A % B = " + (a % b));
		System.out.println("A + B = " + (a + b));
		System.out.println("A - B = " + (a - b));
	}

}
