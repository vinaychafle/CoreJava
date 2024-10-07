package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;
// HashSet, treeset, LinkedHashSet implements set interface
public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Object> h=new HashSet<>();
		h.add(12);
		h.add('t');
		h.add("STring");
		h.add(13);
		h.add(12);
		
		System.out.println(h);
		System.out.println("**********6666");
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Vinay");
		hs.add("UK");
		hs.add("Gain");
		hs.add("Sunny");
		hs.add("Enjoy");
		
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	
}
