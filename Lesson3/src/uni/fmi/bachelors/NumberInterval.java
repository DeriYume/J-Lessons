package uni.fmi.bachelors;

import java.util.Scanner;

public class NumberInterval {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		int number;
		do
		{
			System.out.print("Please input a number between 5 and 50: ");
			number = n.nextInt();
			
		}
		while (number < 5 || number > 50);
			
		System.out.print("Congratulations!");
	}

}
