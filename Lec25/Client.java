package Lec25;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Heap hp = new Heap();
		
//		HeapG<Integer> hp = new HeapG<>();
		
		PriorityQueue<Integer> hp  = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		}); 
		hp.add(100);
		hp.add(50);
		hp.add(30);
		hp.add(10);
		hp.add(70);
		hp.add(80);
		hp.add(20);
		hp.add(90);
		
//		hp.display();
//		System.out.println(hp.getMin());
//		hp.remove();
//		hp.display();

		while(!hp.isEmpty())
			System.out.println(hp.remove());
	}

}
