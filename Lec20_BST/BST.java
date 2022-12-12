package Lec20_BST;

public class BST {

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
	
	public void createTree(int[] arr)
	{
		this.root = createTree(arr, 0, arr.length-1);
	}
	private Node createTree(int[] arr,int si,int ei)
	{
		if(si > ei)
			return null;
		int mid = (si+ei)/2;
		Node r = new Node(arr[mid]);
		r.left = createTree(arr, si, mid-1);
		r.right = createTree(arr, mid+1, ei);
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
	
	public boolean find(int ele)
	{
		return this.find(root,ele);
	}
	private boolean find(Node r,int ele)
	{
		if(r == null)
		{
			return false;
		}
		else
		{
			if(r.data == ele)
			{
				return true;
			}
			else if(r.data > ele)
			{
				return find(r.left,ele);
			}
			else
			{
				return find(r.right,ele);
			}
		}
	}
	public int size()
	{
		return this.size(root);
	}
	private int size(Node r)
	{
		if(r == null)
			return 0;
		else
			return 1+size(r.left)+size(r.right);
	}
	public int min()
	{
//		return min(root);
		Node r = root;
		while(r.left != null)
			r = r.left;
		return r.data;
		
	}
	private int min(Node r)
	{
		if(r.left == null)
			return r.data;
		else
			return min(r.left);
	}
	public void add(int ele)
	{
		if(root == null)
			root = new Node(ele);
		else
			add(root,ele);
	}
	private void add(Node r,int ele)
	{
		if(r.data > ele)
		{
			if(r.left == null)
			{
				r.left = new Node(ele);
			}
			else
			{
				add(r.left,ele);
			}
		}
		else
		{
			if(r.right == null)
			{
				r.right = new Node(ele);
			}
			else
			{
				add(r.right,ele);
			}
		}
	}
	public void add2(int ele)
	{
		this.root = add2(root,ele);
	}
	private Node add2(Node r,int ele)
	{
		if(r == null)
			return new Node(ele);
		else
		{
			if(r.data > ele)
				r.left = add2(r.left,ele);
			else
				r.right = add2(r.right,ele);
			
			return r;
		}
	}
	
	public void delete(int ele)
	{
		this.root = delete(root, ele);
	}
	private Node delete(Node r,int ele)
	{
		if(r == null)
			return null;
		else if(r.data > ele)
			r.left = delete(r.left, ele);
		else if (r.data < ele)
			r.right = delete(r.right, ele);
		else
		{
			if(r.left == null && r.right == null)
				return null;
			else if (r.right == null)
				return r.left;
			else if (r.left == null)
				return r.right;
			else
			{
				int m = min(r.right);
				r.data = m;
				r.right = delete(r.right,m);
			}
		}
		return r;
	}
	
	
}
