package collectiondemos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<>();
		
		h.put(11, "John");
		h.put(12, "bob");
		h.put(13, "kevin");
		h.put(14, "Julie");
		h.put(15, "Julie");
		
		System.out.println(h);
		System.out.println(h.get(h));
		ArrayList a1= new ArrayList ();
		a1.add(h);
		System.out.println(a1);
	System.out.println("**********");
		Set sn=h.entrySet();
		Iterator i=sn.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mp=(Map.Entry) i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		//here only you can repeat Value not key 
	}
}
