public class Tester {
	public static void main(String[] args) {
		MyLinkedList fruits = new MyLinkedList();
		fruits.add("apple"); // System.out.println(fruits.start.data()); System.out.println(fruits.end.data());  
		fruits.add("banana"); // System.out.println(fruits.start.data()); System.out.println(fruits.end.data()); System.out.println(fruits.end.prev().data()); 
		fruits.add("citrus"); // System.out.println(fruits.start.data()); System.out.println(fruits.end.data()); System.out.println(fruits.end.prev().data());
		fruits.add("dog"); // System.out.println(fruits.start.data()); System.out.println(fruits.end.data()); System.out.println(fruits.end.prev().data());
		
		System.out.println();

		System.out.println(fruits);		
		fruits.add(2, "pineapple"); System.out.println(fruits);
		fruits.add(5, "orange"); System.out.println(fruits);
		fruits.add(0, "cucumber"); System.out.println(fruits);
		// fruits.add(324, "error");

		System.out.println(fruits.get(2));

		System.out.println(fruits.get(6));		
		
		System.out.println(fruits);
		System.out.println(fruits.set(3, "BOOM"));
		System.out.println(fruits);

		System.out.println(fruits.toStringReversed());
	}
}