package collectiondemos;

import java.util.ArrayList;
// ArrayList, Linkedlist, vector implements List interface
public class ArrayListSDemo {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList ();
		a1.add(12);
		a1.add("java");
		a1.add(14.9f);
		a1.add(12);
		a1.add('A');
		
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.remove(4));
		System.out.println(a1.contains("java"));
		System.out.println(a1.indexOf("java"));
		System.out.println(a1.isEmpty());
		
	}
}
