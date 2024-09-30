package singlyLL;

public class Demo {
	Node head;
	private int size;
	Demo()
	{
		this.size=0;
	}

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// AddFirst
	public void addFirst(String data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}
		newnode.next=head;
		head = newnode;
	}

	// AddLast
	public void addLast(String data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newnode;
		newnode.next = null;
	}

	// PrintList
	public void printList() {
		if (head == null) {
			System.out.println("List is Empty");
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	//DeleteFirst
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		size--;
		head=head.next;
	}
	//DeleteLast
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		size--;
		if(head.next==null)
		{
			head=null;
            return;
		}
		Node lastNode=head.next;
		Node secondlastNode=head;
		while(lastNode.next != null)
		{
			lastNode=lastNode.next;
			secondlastNode=secondlastNode.next;
		}
		secondlastNode.next=null;
	}
	public int getSize()
	{
		return size;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.addFirst("is");
		d.addFirst("a");
		d.addLast("list");
		d.addFirst("Linked List");
		d.printList();
		d.deleteFirst();
		d.printList();
		d.deleteLast();
		d.printList();
		System.out.println(d.getSize());
		}

}
