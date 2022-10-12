package Lec3;

import java.util.Scanner;

public class Arrays2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[5];
		System.out.println(arr);
		System.out.println(arr[0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr.length+" "+arr[0].length);
		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j =0; j < arr[0].length; j++)
//			{
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j =0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
