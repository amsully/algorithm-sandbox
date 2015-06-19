import static org.junit.Assert.*;

import org.junit.Test;
public class NodeTest {

	
	@Test
	public void testSimpleInversion()
	{
		/**
		 * Original
		 * 			    1
		 * 			  /   \
		 * 		     2 	   3
		 * Inverted
		 *
		 * 			    1
		 * 			  /   \
		 * 		     3 	   2
		 */
			Node root = new Node(1);
			Node leftNode = new Node(2);
			Node rightNode = new Node(3);
			root.setLeftNode(leftNode);
			root.setRightNode(rightNode);
			
			TreeController tree = new TreeController(root);
			
			Node rootInverted = tree.invert(root);
			assertEquals( new Integer(3), rootInverted.getLeftNode().value);
			assertEquals( new Integer(2), rootInverted.getRightNode().value);
			
	}
	
	@Test
	public void testInversionOfSevenNodeTree()
	{
		/**
		 * Original
		 * 			    1
		 * 			  /   \
		 * 		     2 	   3
		 * 			/ \   / \
		 * 		   4  5  6   7
		 * Inverted
		 *		        1
		 * 			  /   \
		 * 		     3 	   2
		 * 			/ \   / \
		 * 		   7   6 5   4
		 */
			Node root = new Node(1);
			Node leftNode = new Node(2);
			Node rightNode = new Node(3);
			root.setLeftNode(leftNode);			root.setRightNode(rightNode);
			leftNode.setLeftNode( new Node(4) );
			leftNode.setRightNode(new Node(5));
			rightNode.setLeftNode(new Node(6));
			rightNode.setRightNode(new Node(7));

			
			
			TreeController tree = new TreeController(root);
			
			Node rootInverted = tree.invert(root);
			assertEquals( rootInverted.getLeftNode().value, new Integer(3));
			assertEquals( rootInverted.getRightNode().value, new Integer(2));
			assertEquals( rootInverted.getLeftNode().getRightNode().value, new Integer(6));
			assertEquals( rootInverted.getRightNode().getRightNode().value, new Integer(4));
	}

	@Test
	public void testInversionOfSixNodeTree()
	{
		/**
		 * Original
		 * 			    1
		 * 			  /   \
		 * 		     2 	   3
		 * 			  \   / \
		 * 		      5  6   7
		 * Inverted
		 *		        1
		 * 			  /   \
		 * 		     3 	   2
		 * 			/ \   / 
		 * 		   7   6 5   
		 */
			Node root = new Node(1);
			Node leftNode = new Node(2);
			Node rightNode = new Node(3);
			root.setLeftNode(leftNode);			root.setRightNode(rightNode);
			leftNode.setRightNode(new Node(5));
			rightNode.setLeftNode(new Node(6));
			rightNode.setRightNode(new Node(7));

			
			
			TreeController tree = new TreeController(root);
			
			Node rootInverted = tree.invert(root);
			assertEquals( rootInverted.getLeftNode().value, new Integer(3));
			assertEquals( rootInverted.getRightNode().value, new Integer(2));
			assertEquals( rootInverted.getLeftNode().getRightNode().value, new Integer(6));
			assertEquals( rootInverted.getRightNode().getRightNode(), null);
	}

}
