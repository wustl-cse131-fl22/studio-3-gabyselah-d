package studio3;

import java.util.Scanner;

public class SeiveStudio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Size Of Array");
		int n = in.nextInt();
		int[] numList = new int [n] ;
			
		for (int i = 0; i < numList.length + 1; i++)
		{
			if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i != 1) || i == 2 || i == 3 || i == 5 )
			{
				System.out.println(i);
			}
		
		}
	}

}
