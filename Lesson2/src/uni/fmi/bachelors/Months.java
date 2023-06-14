package uni.fmi.bachelors;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== DAYS IN A MONTH ===");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input a month in upper case: ");
		String month = in.nextLine();
		
		switch (month)
		{
		case "JAN": case "MAR": case "MAY": case "JUL": case "AUG": case "OCT":
		case "DEC": System.out.println("This month has 31 days!");break;
		
		case "APR": case "JUN": case "SEP":
		case "NOV": System.out.println("This month has 30 days!");break;
		
		case "FEB":
			System.out.print("Please input the year -> ");
			int year = in.nextInt();
			
			{
				if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					System.out.println("This month has 29 days!");
				}
				else
				{
					System.out.println("This month has 28 days!");
				}
			};break;
		default: System.out.println("Error! Invalid month!");break;
		}
	}

}
