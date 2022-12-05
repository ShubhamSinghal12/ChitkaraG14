package Lecture17_Trees;

import java.util.Scanner;

public class BinaryTree {

	Scanner sc =  new Scanner(System.in);
	private class Node{
		int data;
		Node left;
		Node right;
		
		Node()
		{
			this(0);
		}
		Node(int data)
		{
			this.data = data;
			left=right=null;
		}
	}
	
	private Node root;
	
	public void createT() {
		this.root = createTree();
	}
	
	private Node createTree()
	{
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		Node r = new Node(n);
		System.out.println("Is there a left child of "+n);
		boolean f = sc.nextBoolean();
		if(f)
		{
			r.left = createTree();
		}
		
		System.out.println("Is there a right child of "+n);
		f = sc.nextBoolean();
		if(f)
		{
			r.right = createTree();
		}
		return r;
	}
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			String st = "";
			if(r.left!=null)
			{
				st += r.left.data;
			}
			st+= " -> "+r.data+" <- ";
			if(r.right != null)
			{
				st += r.right.data;
			}
			System.out.println(st);
			
			display(r.left);
			display(r.right);
		}
	}

}
