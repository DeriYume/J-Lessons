package uni.fmi.bachelors;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input your name: ");
		
		String name = in.nextLine();
		
		System.out.println("Hello, " + name);
	}
}
