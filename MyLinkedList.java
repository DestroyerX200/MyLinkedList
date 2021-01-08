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
 	if (index < 0 || index >= size) {
 		throw new IndexOutOfBoundsException("index " + index + " not a valid index.");
 	}
	else if (index == size) {
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
	 	Node current = start;
	 	for (int i = 0; i < index; i++) {
	 		current = current.next();
		}
	current = current.prev();
	Node before = current;
	Node after = current.next();
	Node insert = new Node(value);
	before.setNext(insert);
	insert.setPrev(before);
	insert.setNext(after);
	after.setPrev(insert);
	size++;
	}
 }
 public String get(int index) {
 	if (index < 0 || index >= size) {
 		throw new IndexOutOfBoundsException("index " + index + " not a valid index.");
 	}
 	Node current = start;
 	for (int i = 0; i < index; i++) {
 		current = current.next();
 	}
 	return current.data();
 }
 public String set(int index, String value) {
 	if (index < 0 || index >= size) {
 		throw new IndexOutOfBoundsException("index " + index + " not a valid index.");
 	}
 	Node current = start;
	 	for (int i = 0; i < index; i++) {
	 		current = current.next();
		}
	Node oldCurrent = current;
	Node before = current.prev();
	Node after = current.next();
	current = new Node(value);
	before.setNext(current);
	current.setPrev(before);
	current.setNext(after);
	after.setPrev(current);
	return oldCurrent.data();
 }
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
 public String toStringReversed() {
 	if (size == 0) {
 		return "";
 	}
 	String returnStr = "[";
 	Node current = end;
 	for (int i = 0; i < size-1; i++) {
 		returnStr += current.data() + ", ";
 		current = current.prev();
 	}
 	returnStr += start.data() + "]";
 	return returnStr;
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}