package Lec26;

import java.util.HashSet;

public class LongestConsecutiveSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public int longestConsecutive(int[] nums) {
    
		int maxs = 0;
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < nums.length; i++)
		{
			hs.add(nums[i]);
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			if(!hs.contains(nums[i]-1))
			{
				int count = 1;
				int val = nums[i];
				while(hs.contains(val+1))
				{
					count += 1;
					val += 1;
				}
				if(maxs < count)
				{
					maxs = count;
				}
			}
		}
		return maxs;
    }

}
