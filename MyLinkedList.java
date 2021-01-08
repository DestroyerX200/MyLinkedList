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
 // public boolean add(int index, String value);
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