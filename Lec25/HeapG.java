package Lec25;

import java.util.ArrayList;

public class HeapG <T extends Comparable<T>>{

	ArrayList<T> heap = new ArrayList<>();
	
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	public int size()
	{
		return heap.size();
	}
	
	public void add(T ele)
	{
		heap.add(ele);
		upheapify(heap.size()-1);
	}
	
	private void swap(int a,int b)
	{
		T t = heap.get(a);
		heap.set(a, heap.get(b));
		heap.set(b, t);
	}
	private void upheapify(int ci)
	{
//		if(ci == 0)
//			return;
		int pi = (ci-1)/2;
		if(heap.get(pi).compareTo(heap.get(ci)) > 0)
		{
			swap(pi,ci);
			upheapify(pi);
		}
	}
	
	public T getMin()
	{
		return heap.get(0);
	}
	
	public T remove()
	{
		T ans = heap.get(0);
		swap(0,heap.size()-1);
		heap.remove(heap.size()-1);
		downheapify(0);
		
		return ans;
	}
	
	private void downheapify(int pi)
	{
		int lc = 2*pi+1;
		int rc = 2*pi+2;
		
		int min = pi;
		
		if(lc < heap.size() && heap.get(min).compareTo(heap.get(lc)) > 0)
		{
			min = lc;
		}
		if(rc < heap.size() && heap.get(min).compareTo(heap.get(rc)) > 0)
		{
			min = rc;
		}
		
		if(min != pi)
		{
			swap(pi,min);
			downheapify(min);
		}
		
	}
	
	public void display()
	{
		System.out.println(heap);
	}
	

}
