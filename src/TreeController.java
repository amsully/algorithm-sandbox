
public class TreeController {
	
	Node root;
	
	public TreeController(Node root)
	{
		this.root = root;
	}
	
	public Node invert(Node root)
	{


		
		if( root.getLeftNode() == null && root.getRightNode() == null)
		{
			Node temp = root.getLeftNode();
			root.setLeftNode(root.getRightNode());
			root.setRightNode(temp);
			return root;
		}
		else
		{
			if( root.getLeftNode() != null )
			{
				invert(root.getLeftNode());
			}
			if( root.getLeftNode() != null )
			{
				invert(root.getRightNode());
			}
		}
		Node temp = root.getLeftNode();
		root.setLeftNode(root.getRightNode());
		root.setRightNode(temp);		
		return root;
	}
	
	public void printTree()
	{
		System.out.println(root.value);
		
		printTreeChild(root.getLeftNode());
		printTreeChild(root.getRightNode());
		
	}

	private void printTreeChild(Node node) {
		// TODO Auto-generated method stub
		
	}
	
}
