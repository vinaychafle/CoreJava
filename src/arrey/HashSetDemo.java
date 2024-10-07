package arrey;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Object> h=new HashSet<>();
		h.add(15);
		h.add('A');
		h.add("string");
		h.add(15.4f);
		h.add(15);
		
		System.out.println(h);
	}
}
