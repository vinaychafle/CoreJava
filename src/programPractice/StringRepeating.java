package programPractice;

import java.util.HashMap;
import java.util.Map;

public class StringRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="my name is khan";
		char[] ch=a.toCharArray();
		
		Map<Character, Integer>m=new HashMap<Character, Integer>();
		
		for(char cs:ch)
		{
			if(!a.valueOf(cs).isBlank())
			{
				if(m.containsKey(cs))
				{
					m.put(cs, m.get(cs)+1);
				}
				else
					m.put(cs, 1);
			}
		}
		System.out.println(a+":"+m);
		
		
	}

}
