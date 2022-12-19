package Lec23;

import java.util.LinkedList;
import java.util.Queue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person();
//		p.hello();
//		System.out.println(Test.m);
//		p.hd();
//		Test.hs();
		
//		Test t = new Person();
//		t.hello();
//		
//		Queue<Integer> qt = new LinkedList<>();
		
		Anm a = new Anm() {

			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Anm says hello");
				
			}
			
		};
		a.hello();
		
	}

}
