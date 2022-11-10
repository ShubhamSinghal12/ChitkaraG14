package Lec7;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
//		st.push(100);
//		st.push(200);
//		st.push(300);
//		st.push(400);
//		System.out.println(st);
//		System.out.println(st.pop());
//		System.out.println(st.peek());
		
		for(int i = 1; i <= 5; i++)
			st.push(i);
		
		System.out.println(st);
//		reverse(st);
//		insertFirst(st, 0);
		rev2(st);
//		revDisp(st);
		System.out.println(st);

	}
	
	public static void reverse(Stack<Integer> st)
	{
//		Stack<Integer> temp1 = new Stack<>();
//		while(!st.isEmpty())
//		{
//			int x = st.pop();
//			temp1.push(x);
//		}
//		Stack<Integer> temp2 = new Stack<>();
//		while(!temp1.isEmpty())
//		{
//			int x = temp1.pop();
//			temp2.push(x);
//		}
		
		Stack<Integer> temp2 = new Stack<>();
		revDisp2(st, temp2);
		while(!temp2.isEmpty())
		{
			int x = temp2.pop();
			st.push(x);
		}
	}
	
	public static void revDisp(Stack<Integer> st)
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int x = st.pop();
			System.out.println(x);
			revDisp(st);
			st.push(x);
		}
	}
	
	public static void revDisp2(Stack<Integer> st,Stack<Integer> temp)
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int x = st.pop();
//			System.out.println(x);
			revDisp2(st,temp);
			temp.push(x);
		}
	}
	
	public static void insertFirst(Stack<Integer> st,int t)
	{
		if(st.isEmpty())
		{
			st.push(t);
		}
		else
		{
			int x = st.pop();
			insertFirst(st, t);
			st.push(x);
		}
	}
	
	
	public static void rev2(Stack<Integer> st)
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int x = st.pop();
			rev2(st);
			insertFirst(st, x);
		}
	}
	
}
