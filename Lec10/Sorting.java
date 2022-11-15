package Lec10;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,4,5,2};
//		selectionSort(arr);
//		Arrays.sort(arr);
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void swap(int[] arr,int a,int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int minI = i;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[minI] > arr[j])
				{
					minI = j;
				}
			}
			swap(arr,i,minI);
		}
	}
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int swaps = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr,j,j+1);
					swaps+=1;
				}
			}
			if(swaps == 0)
			{
				break;
			}
			
		}
	}
	
	public static void insertionSort(int[] arr)
	{
//		for(int )	
	}

}
