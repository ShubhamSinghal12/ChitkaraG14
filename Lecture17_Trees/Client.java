package Lecture17_Trees;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 true 2 true 4 false false false true 3 false false
		BinaryTree bt = new BinaryTree();
//		bt.createT();
//		bt.display();
		bt.createTree2();
//		System.out.println(bt.ht());
//		bt.leftView();
		bt.verticalOrder();

	}

}
