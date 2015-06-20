
public class SinglyLinkedList {
	
	SinglyNode head;
	
	public SinglyLinkedList()
	{
		head = null;
	}

	public SinglyNode getHead() {
		return head;
	}

	public void setHead(SinglyNode head) {
		this.head = head;
	}
	
	public void insert(SinglyNode node)
	{
		node.setTail(head);
		head = node;
	}

	public void delete( SinglyNode node)
	{
		
		SinglyNode prevNode = null;
		SinglyNode traverseNode = head;
		
		while(traverseNode != null)
		{
			if(traverseNode == node)
			{
				prevNode.setTail( node.getTail() );
				return;
			}
			
			prevNode = traverseNode;
			traverseNode = node.getTail();
		}
	}
	
	
}
