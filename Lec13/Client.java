package Lec13;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedLIst ll = new MyLinkedLIst();
		for(int i = 1; i <= 5;i++)
		{
			ll.addFirst(i);
		}
		ll.display();
//		ll.bubblesort();
//		ll.display();
		System.out.println(ll.mid());

	}
	

}
