public class MyLinkedList{
 private int size;
 private Node start,end;  
 public MyLinkedList() {
 	size = 0;
 }
 public int size() {
 	return size;
 }
 public boolean add(String value) {
 	if (size == 0) {
 		start = new Node(value);
 		end = start;
 	}
 	else {
 		Node oldEnd = end;
 		end = new Node(value);
 		oldEnd.setNext(end);
 		end.setPrev(oldEnd);
 	}
 	size++;
 	return true;
 }
 public void add(int index, String value) {
 	if (index < 0 || index > size) {
 		throw new IndexOutOfBoundsException("index " + index + " is invalid.");
 	}
	else if (index == size) {
		System.out.println("DEBUG");
 		add(value);
 	}
 	else if (index == 0) {
 		Node insert = new Node(value);
 		insert.setNext(start);
 		start.setPrev(insert);
 		start = insert;
 		size++;
 	}
 	else {
 		System.out.println("DEBUG");
	 	Node current = start;
	 	for (int i = 0; i < index; i++) {
	 		if (i == index-1) {
	 			Node before = current;
	 			Node after = current.next();
	 			Node insert = new Node(value);
	 			before.setNext(insert);
	 			insert.setPrev(before);
	 			insert.setNext(after);
	 			after.setPrev(insert);
	 		}
	 		current = current.next();
		}
		size++;
	}
 }
 // public String get(int index);
 // public String set(int index, String value);
 public String toString() {
 	if (size == 0) {
 		return "";
 	}
 	String returnStr = "[";
 	Node current = start;
 	for (int i = 0; i < size-1; i++) {
 		returnStr += current.data() + ", ";
 		current = current.next();
 	}
 	returnStr += end.data() + "]";
 	return returnStr;
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}