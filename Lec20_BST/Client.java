package Lec20_BST;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70};
		BST bt = new BST();
		bt.createTree(arr);
		bt.add(15);
//		bt.add(20);
//		bt.add(10);
		bt.display();
		bt.delete(40);
		System.out.println("-----------------");
		bt.display();

	}

}
