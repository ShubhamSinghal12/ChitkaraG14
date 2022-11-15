package Lec8;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,7,6,5,10,4,8};
		nextGreater(arr);

	}
	public static int[] nextGreater(int[] arr)
	{
		int[] ans = new int[arr.length];
		int cnt = 0;
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[st.peek()] > arr[i])
			{
				int ind = st.pop();
				ans[ind] = i-ind;
			}
			st.push(i);
			cnt += st.size();
		}
		while(!st.isEmpty())
		{
			int ind = st.pop();
			ans[ind] = -1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ans));
		System.out.println(st);
		return ans;
	}

}
