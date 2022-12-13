package Lec21_AVL;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVL at = new AVL();
		for(int i = 1; i <= 10; i++)
			at.insert(i);
		at.display();
		at.delete(1);
		at.delete(3);
		System.out.println("----------------------");
		at.display();

	}

}
