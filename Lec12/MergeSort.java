package Lec12;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,4,6,8};
		int[] arr2 = {2,3,5,7,9,10};
		System.out.println(Arrays.toString(merge(arr1, arr2)));

	}
	
	public static int[] merge(int[] a,int[] b)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int[] ans = new int[a.length+b.length];
		
		while(i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				ans[k] = a[i];
				i++;
				k++;
			}
			else
			{
				ans[k] = b[j];
				j++;
				k++;
			}
		}
		while(i < a.length)
		{
			ans[k] = a[i];
			i++;
			k++;
		}
		while(j < b.length)
		{
			ans[k] = b[j];
			j++;
			k++;
		}
		return ans;
	}
	
	public static int[] mergerSort(int[] arr,int si,int ei)
	{
		if(si == ei)
		{
			int[] ans = new int[1];
			ans[0] = arr[si];
			return ans;
		}
		else
		{
			int mid = (si+ei)/2;
			int[] left = mergerSort(arr, si, mid);
			int[] right = mergerSort(arr, mid+1, ei);
			return merge(left, right);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
