package Lec24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pair<Integer,String> p = new Pair<>(10,"Hello");
//		System.out.println(p.data1 + " "+ p.data2);
//		Pair<String> ps = new Pair<>("Hello");
//		System.out.println(ps.data);
		
		Car[] cars = new Car[5];
		cars[0] = new Car(10000,80,"Green");
		cars[1] = new Car(11000,90,"Red");
		cars[2] = new Car(8000,100,"Yellow");
		cars[3] = new Car(12000,180,"Green");
		cars[4] = new Car(14000,120,"Green");
		
		
//		MyLinkedLIst<Car> l1 = new MyLinkedLIst<>();
//		for(int i = 0; i < 5; i++)
//			l1.addLast(cars[i]);
//		
//		l1.display();
//		l1.bubblesort();
//		l1.display();
		
		ArrayList<Car> al = new ArrayList<>();
		for(int i = 0; i < 5; i++)
			al.add(cars[i]);
		
		for(Car i : al)
		{
			System.out.println(i);
		}
		System.out.println("-------------------------");
		
		Collections.sort(al,new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				int a = o1.color.compareTo(o2.color);
				if(a == 0)
				{
					return o2.speed - o1.speed;
				}
				else
					return a;
			}
		});
		
		for(Car i : al)
		{
			System.out.println(i);
		}
		
	}
}
