package Lec13;
public class MyLinkedLIst {

	private class Node {
			
		int data;
		Node next;
			
		Node()
		{
			this(0,null);
		}
		Node(int data)
		{
			this(data,null);
		}
		Node(int data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	private Node head = null;
	
	public void addFirst(int ele)
	{
		Node temp = new Node(ele,this.head);
		this.head = temp;
	}
	
	
	public void display()
	{
		Node temp = this.head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	public int size()
	{
		int count = 0;
		Node temp = this.head;
		while(temp != null)
		{
//			System.out.print(temp.data+" ");
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public boolean isEmpty()
	{
		return this.head == null;
	}
	
	public void addLast(int ele)
	{
		if(isEmpty())
		{
			addFirst(ele);
			return;
		}
		Node temp = this.head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new Node(ele);
		
	}
	
	public int getFirst()
	{
		return this.head.data;
	}
	
	public int getAt(int idx)
	{
		if(idx <0 || idx >= size())
			return 0;
		int i = 0;
		Node temp = this.head;
		while(i != idx)
		{
			temp = temp.next;
			i++;
		}
		return temp.data;
	}
	
	private Node getNodeAt(int idx)
	{
		if(idx <0 || idx >= size())
			return null;
		int i = 0;
		Node temp = this.head;
		while(i != idx)
		{
			temp = temp.next;
			i++;
		}
		return temp;
		
	}
	
	public void addAt(int ele,int idx)
	{
		if(idx == 0)
		{
			addFirst(ele);
			return;
		}
		Node temp = getNodeAt(idx-1);
		Node nn = new Node(ele,temp.next);
		temp.next = nn;
	}
	
	public int getLast()
	{
		return getNodeAt(size()-1).data;
	}
	
	public int removeFirst()
	{
		int x = this.head.data;
		this.head = this.head.next;
		return x;
	}
	
	public int removeLast()
	{
		if(size()<=1)
		{
			return removeFirst();
		}
		Node temp = getNodeAt(size()-2);
		int x = temp.next.data;
		temp.next = null;
		return x;
	}
	
	public int removeAt(int idx)
	{
		if(idx == 0)
		{
			return removeFirst();
		}
		Node temp = getNodeAt(idx-1);
		int x = temp.next.data;
		temp.next = temp.next.next;
		return x;
	}
	public void set(int idx,int ele)
	{
		Node temp = getNodeAt(idx);
		temp.data = ele;
	}
	
	public void reverse()
	{
		Node prev = null;
		Node cur = this.head;
		while(cur != null)
		{
			Node ahead = cur.next;
			cur.next = prev;
			
			prev = cur;
			cur = ahead;
		}
		this.head = prev;
	}
	
	public void revR()
	{
		revR(null,this.head);
	}
	public void revR2()
	{
		Node temp = this.head;
		revR(this.head);
		temp.next = null;
	}
	private void revR(Node prev,Node cur)
	{
		if(cur == null)
		{
			this.head = prev;
			return;
		}
		else
		{
			revR(cur, cur.next);
			cur.next = prev;
		}
	}
	private void revR(Node prev)
	{
		if(prev.next == null)
		{
			this.head = prev;
			return;
		}
		else
		{
			revR(prev.next);
			prev.next.next = prev;
		}
	}
	
	public void bubblesort()
	{
		Node i = this.head;
		while(i.next!=null)
		{
			Node j = this.head;
			int swap = 0;
			while(j.next!=null)
			{
				if(j.data > j.next.data)
				{
					int t = j.data;
					j.data = j.next.data;
					j.next.data = t;
					swap++;
				}
				j = j.next;
			}
			if(swap == 0)
			{
				return;
			}
			i = i.next;
		}
	}
	
	public int mid()
	{
		Node slow = this.head;
		Node fast = this.head;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}
	
	
}
