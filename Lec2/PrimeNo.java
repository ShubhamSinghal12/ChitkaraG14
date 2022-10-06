package Lec2;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n%i == 0)
			{
				System.out.println("Not Prime");
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Prime");
		}
}
}
