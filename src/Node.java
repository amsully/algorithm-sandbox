
public class Node {
	
	Node leftNode;
	Node rightNode;
	Integer value;
	
	public Node(Integer value)
	{
		this.value = value;
		leftNode = null;
		rightNode = null;
	}


	public Integer getValue() {
		return value;
	}


	public void setValue(Integer value) {
		this.value = value;
	}


	public Node getLeftNode() {
		return leftNode;
	}


	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}


	public Node getRightNode() {
		return rightNode;
	}


	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	
}
