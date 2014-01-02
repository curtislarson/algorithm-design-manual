public class ReverseLinkedList
{
	public static void main(String[] args)
	{
		ReverseLinkedList ll = new ReverseLinkedList();
		ll.run();
	}

	public void run()
	{
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);

		doReverse(head);
		Node newHead = fourth;
		while (newHead != null) {
			System.out.println(newHead);
			newHead = newHead.getNext();
		}
	}

	public Node reverse(Node node, Node nextNode)
	{
		if (nextNode == null) {
			return node;
		}
		else {
			Node newNode = reverse(nextNode, nextNode.getNext());
			newNode.setNext(node);
			return node;
		}
	}

	public void doReverse(Node headNode)
	{
		reverse(headNode, headNode.getNext());
		headNode.setNext(null);
	}

	private class Node
	{
		Node mNext;
		int mData;

		Node(int data)
		{
			mData = data;
		}

		void setNext(Node next)
		{
			mNext = next;
		}

		Node getNext()
		{
			return mNext;
		}

		int getData()
		{
			return mData;
		}

		@Override
		public String toString()
		{
			return "Data: " + mData;
		}
	}
}