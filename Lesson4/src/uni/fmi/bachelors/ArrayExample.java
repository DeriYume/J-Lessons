package uni.fmi.bachelors;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input array lenth: ");
		
		int arrSize = in.nextInt();
		
		int[] arrNum = new int[arrSize];
		
		for (int i = 0 ; i < arrSize ; i++)
		{
			System.out.print("Element[" + (i+1) + "]: ");
			arrNum[i] = in.nextInt();
		}
		
		System.out.print("Your unput visualized: ");
		
		for (int i = 0 ; i < arrNum.length ; i++)
		{
			System.out.print(arrNum[i] + " ");
		}
	}

}
