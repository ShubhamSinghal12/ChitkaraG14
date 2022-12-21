package Lec26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 1000);
		map.put("USA", 200);
		map.put("Russia", 400);
		map.put("China", 200);
		map.put("Pakistan", 0);
		
//		System.out.println(map);
//		System.out.println(map.get("Ind"));
//		map.put("India", 2000);
//		System.out.println(map);
//		
//		map.remove("Pakistan");
//		System.out.println(map);
//		
//		System.out.println(map.containsKey("India"));
//		
//		Set<String> ks =  map.keySet();
//		for(String key:ks)
//		{
//			System.out.println(key+" : "+map.get(key));
//		}
//		
//		System.out.println("-----------------------");
//		for(String key:map.keySet())
//		{
//			System.out.println(key+" : "+map.get(key));
//		}
//		
//		System.out.println("-----------------------");
//		ArrayList<String> al = new ArrayList<>(map.keySet());
//		
//		for(String key:al)
//		{
//			System.out.println(key+" : "+map.get(key));
//		}
//		TreeMap<String, Integer> tmap = new TreeMap<>();
//		tmap.put("India", 1000);
//		tmap.put("USA", 200);
//		tmap.put("Russia", 400);
//		tmap.put("China", 200);
//		tmap.put("Pakistan", 0);
//		System.out.println(tmap);
//		
		
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		lmap.put("India", 1000);
		lmap.put("USA", 200);
		lmap.put("Russia", 400);
		lmap.put("China", 200);
		lmap.put("Pakistan", 0);
		System.out.println(lmap);
		

	}

}
