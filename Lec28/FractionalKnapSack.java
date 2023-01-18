package Lec28;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
	
	
	static class Items{
		int w;
		int p;
		
		Items(int w,int p)
		{
			this.w = w;
			this.p = p;
		}
		@Override
		public String toString()
		{
			return this.w+" "+this.p;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Items[] it = new Items[6];
		it[0] = new Items(10,100);
		it[1] = new Items(20,1500);
		it[2] = new Items(50,2500);
		it[3] = new Items(40,1000);
		it[4] = new Items(60,4000);
		it[5] = new Items(80,800);
		
		Arrays.sort(it,new Comparator<Items>() {

			@Override
			public int compare(Items o1, Items o2) {
				// TODO Auto-generated method stub
				double p1 = (double)o1.p/o1.w;
				double p2 = (double)o2.p/o2.w;
				
				if(p2>p1)
					return 1;
				else if(p1==p2)
					return 0;
				else
					return -1;
			}
		});
		
		for(Items i: it)
		{
			System.out.println(i);
		}
		
		int capacity = 100;
		int profit = 0;
		for(int i = 0; i < it.length; i++)
		{
			if(it[i].w <= capacity)
			{
				profit += it[i].p;
				capacity -= it[i].w;
			}
			else
			{
				profit += capacity*it[i].p/it[i].w;
				capacity = 0;
				break;
			}
		}
		System.out.println(profit);

	}

}
