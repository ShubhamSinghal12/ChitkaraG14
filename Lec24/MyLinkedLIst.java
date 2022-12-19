package Lec24;

public class MyLinkedLIst <T extends Comparable<T>> {

	private class Node {
			
		T data;
		Node next;
			
		Node()
		{
			this(null,null);
		}
		Node(T data)
		{
			this(data,null);
		}
		Node(T data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	private Node head = null;
	
	public void addFirst(T ele)
	{
		Node temp = new Node(ele,this.head);
		this.head = temp;
	}
	
	
	public void display()
	{
		Node temp = this.head;
		while(temp != null)
		{
			System.out.println(temp.data);
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
	
	public void addLast(T ele)
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
	
	public T getFirst()
	{
		return this.head.data;
	}
	
	public T getAt(int idx)
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
	
	public void addAt(T ele,int idx)
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
	
	public T getLast()
	{
		return getNodeAt(size()-1).data;
	}
	
	public T removeFirst()
	{
		T x = this.head.data;
		this.head = this.head.next;
		return x;
	}
	
	public T removeLast()
	{
		if(size()<=1)
		{
			return removeFirst();
		}
		Node temp = getNodeAt(size()-2);
		T x = temp.next.data;
		temp.next = null;
		return x;
	}
	
	public T removeAt(int idx)
	{
		if(idx == 0)
		{
			return removeFirst();
		}
		Node temp = getNodeAt(idx-1);
		T x = temp.next.data;
		temp.next = temp.next.next;
		return x;
	}
	public void set(int idx,T ele)
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
				if(j.data.compareTo(j.next.data) > 0)
				{
					T t = j.data;
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
	
	public T mid()
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
	
	private Node midN()
	{
		Node slow = this.head;
		Node fast = this.head;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}	
	
	
	
}
