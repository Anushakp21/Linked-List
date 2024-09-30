package queueusingLL;

public class Demo {
	static class Node{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static class Queue
	{
		static Node head=null;
		static Node tail=null;
		public static boolean isEmpty()
		{
			return head==null && tail==null;
		}
		//Enqueue
		public static void Enqueue(int data)
		{
			Node newNode=new Node(data);
			if(isEmpty())
			{
				tail=head=newNode;
				return;
			}
			tail.next=newNode;
			tail=newNode;
		}
		//Dequeue
		public static int Dequeue()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			if(head==tail)
			{
				tail=null;
			}
			int front=head.data;
			head=head.next;
			return front;	
		}
		public static int front()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(5);
		while(!q.isEmpty())
		{
			System.out.println(q.front());
			q.Dequeue();
		}
		q.Enqueue(9);
		System.out.println(q.front());
	}
}
