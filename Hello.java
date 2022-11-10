import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a,b;
//		a = new int[5];
//		b = new int[5];
//		System.out.println(a);
//		a[2] = 100;
//		b[2] = 100;
////		b = a;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(Arrays.toString(b));
//		
////		System.out.println(a.length);
//		display(a);
		
//		int a = 10,b = 20;
//		int c = add(a,b);
//		System.out.println(c);
		
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		System.out.println(arr[0]+" "+arr[1]);
//		swap(arr,0,1);
//		System.out.println(arr[0]+" "+arr[1]);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.size());
		al.add(3,100);
		System.out.println(al);
		al.set(3, -100);
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		
		for(int i:al)
		{
			System.out.println(i);
		}
		
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[0][1]);
	}
	
	public static void swap(int a,int b)
	{
		int t = a;
		a = b;
		b = t;
	}
	
	public static void swap(int[]arr,int a,int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static void display(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int add(int a,int b)
	{
		int c = a+b;
		return c;
	}

}
