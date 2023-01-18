package Lec29;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(houseR(nums, 0));
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
		System.out.println(houseRTD(nums, 0, dp));

	}
	
	public static int houseR(int[] nums,int i)
	{
		if(i >= nums.length)
			return 0;
		
		int r = nums[i] + houseR(nums, i+2);
		int nr = houseR(nums, i+1);
		return Math.max(r, nr);
	}
	
	public static int houseRTD(int[] nums,int i,int[] dp)
	{
		if(i >= nums.length)
			return 0;
		if(dp[i] != -1)
		{
			return dp[i];
		}
		
		int r = nums[i] + houseRTD(nums, i+2,dp);
		int nr = houseRTD(nums, i+1,dp);
		return dp[i] = Math.max(r, nr);
	}

}
