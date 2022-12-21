package Lec26;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1,1,1,2,2,3,3,4,4,5};
		HashMap<Integer,Integer> map = new HashMap<>();
		
        for(int i = 0; i < nums1.length; i++)
        {
//        	if(map.containsKey(nums1[i]))
//        	{
//        		map.put(nums1[i], map.get(nums1[i])+1);
//        	}
//        	else
//        	{
//        		map.put(nums1[i], 1);
//        	}
        	
        	map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        System.out.println(map);
		
		

	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		
        for(int i = 0; i < nums1.length; i++)
        {
        	map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        
        for(int i = 0; i < nums2.length; i++)
        {
        	int f = map.getOrDefault(nums2[i],0);
        	if(f > 0)
        	{
        		ans.add(nums2[i]);
        		map.put(nums2[i], map.get(nums2[i])-1);
        	}
        }
        
        int[] arr = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
        {
        	arr[i] = ans.get(i);
        }
        return arr;
    }

}
