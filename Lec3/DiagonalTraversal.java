package Lec3;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		for(int i = 0; i <= arr.length+arr[0].length-2; i++)
		{
			int si = 0;
			int sj = 0;
			if(i < arr.length)
			{
				si = i;
				sj = 0;
			}
			else
			{
				si = arr.length-1;
				sj = i-arr.length+1;
			}
			
			ArrayList<Integer> al = new ArrayList<>();
			while(si >= 0 && sj < arr[0].length)
			{
				al.add(arr[si][sj]);
				si--;
				sj++;
			}
			if(i%2 == 0)
			{
				System.out.println(al);
			}
			else
			{
				Collections.reverse(al);
				System.out.println(al);
			}
		}
		
		
	}

}
