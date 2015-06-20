import static org.junit.Assert.*;

import org.junit.Test;


public class SinglyLinkedListTest {

	
	@Test
	public void testSinglyNode()
	{
		
		SinglyNode node = new SinglyNode();
		SinglyNode node2 = new SinglyNode();
		node.setTail(node2);
		
		assertEquals(node.getTail(),node2);
	}
	
	@Test
	public void testSinglyLinkedList()
	{
		SinglyLinkedList linkedList = new SinglyLinkedList();
		SinglyNode node =  new SinglyNode();
		
		
		linkedList.insert(node);
		
		assertEquals(linkedList.getHead(), node);
		
	}
	
	@Test
	public void testSinglyLinkedListInsert()
	{
		SinglyLinkedList linkedList = new SinglyLinkedList();
		SinglyNode node =  new SinglyNode();
		SinglyNode insertNode = new SinglyNode();
		
		linkedList.setHead(node);
		linkedList.insert(insertNode);
		
		
		assertEquals(linkedList.getHead(), insertNode);
		assertEquals(linkedList.getHead().getTail(), node);
		
	}
	
	@Test
	public void testSinglyLinkedListDelete()
	{
		SinglyLinkedList linkedList = new SinglyLinkedList();
		SinglyNode node =  new SinglyNode();
		SinglyNode insertNode = new SinglyNode();
		
		// [node]
		linkedList.setHead(node);
		
		// [insertNode] -> [node]
		linkedList.insert(insertNode);
		
		// [insertNode]
		linkedList.delete(node);
		
		assertEquals(linkedList.getHead(), insertNode);
		assertEquals(linkedList.getHead().getTail(), null);
		
	}
	
	
	
}
