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

		System.out.println();

		System.out.println(fruits);
		System.out.println(fruits.remove(0)); System.out.println(fruits);
		System.out.println(fruits.remove(5)); System.out.println(fruits);
		// System.out.println(fruits.remove(0)); System.out.println(fruits);
		// System.out.println(fruits.remove(0)); System.out.println(fruits);
		// System.out.println(fruits.remove(0)); System.out.println(fruits);
		// System.out.println(fruits.remove(0)); System.out.println(fruits);
		MyLinkedList vegetables = new MyLinkedList();
		vegetables.add("carrot"); vegetables.add("broccoli"); vegetables.add("turnip");
		System.out.println(vegetables);

		System.out.println();
		System.out.println("fruits: " + fruits);
		System.out.println("vegetables: " + vegetables);

		System.out.println("method call: fruits.extend(vegetables)");
		fruits.extend(vegetables);
		System.out.println("expected fruits:");
		System.out.println("[apple, banana, BOOM, citrus, dog, carrot, broccoli, turnip]");
		System.out.println("your fruits:");
		System.out.println(fruits);

		System.out.println();

		System.out.println("expected vegetables:");
		System.out.println("[]");
		System.out.println("your vegetables:");
		System.out.println(vegetables);

		System.out.println("Mr. K's quick testing code:");
		MyLinkedList a = new MyLinkedList();
    MyLinkedList b = new MyLinkedList();
    for(int i = 0; i < 10; i++){
      if(i < 5){
        a.add(i+"");
      }else{
        b.add(i+"");
      }
    }
    System.out.println();
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());

    a.extend(b);
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println("B reversed:"+b.toStringReversed()+b.size());

    MyLinkedList empty1 = new MyLinkedList();
    MyLinkedList empty2 = new MyLinkedList();
    empty1.extend(empty2);
    System.out.println("empty1: " + empty1 + empty1.size());
    System.out.println("empty2: " + empty2 + empty2.size());
    fruits.extend(empty1);
    System.out.println("fruits: " + fruits + fruits.size());
    System.out.println("empty1: " + empty1 + empty1.size());
    empty2.extend(fruits);
    System.out.println("empty2: " + empty2 + empty2.size());
    System.out.println("fruits: " + fruits + fruits.size());
	}
}