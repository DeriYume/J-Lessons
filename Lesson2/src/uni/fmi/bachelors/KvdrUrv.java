package uni.fmi.bachelors;

import java.util.Scanner;

public class KvdrUrv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===QUADRATIC EQUATION CALCULATOR===");
		
		Scanner in = new Scanner(System.in);
		System.out.println("*Please input a, b and c variables*");
		
		System.out.print("a = ");
		double a = in.nextDouble();
		System.out.print("b = ");
		double b = in.nextDouble();
		System.out.print("c = ");
		double c = in.nextDouble();
		
		double d = Math.pow(b, 2.0) - 4*a*c;
		System.out.println("D = " + d);
		
		if (d > 0)
		{
			double x1 = ( -b + Math.sqrt(d) ) / ( 2 * a );
			double x2 = ( -b - Math.sqrt(d) ) / ( 2 * a );
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		else if (d < 0)
		{
			System.out.println("No real roots!");
		}
		else
		{
			double x = -b / 2*a;
			System.out.println("x = " + x);
		}
	}

}
