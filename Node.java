public class Node {
	public Node(String value) {
		data = value;
	}
	private String data;
	private Node next,prev;
	//write get/set methods for all three instance variables.
	public String data() {
		return data;
	}
	public Node next() {
		return next;
	}
	public Node prev() {
		return prev;
	}
	public String setData(String data) {
		this.data = data;
	}
	public Node setNext(Node node) {
		next = node;
	}
	public Node setPrev(Node node) {
		prev = node;
	} 

}