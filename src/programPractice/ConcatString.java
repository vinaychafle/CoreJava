package programPractice;

import java.util.List;

public class ConcatString {

	public static void main(String[] args) {
		String str1="ABC";
		String str2="XYZ";
		String str3="PQR";
		
		System.out.println(str1.concat(str2).concat(str3));
		
		StringBuffer s=new StringBuffer(str1);
		s.append(str2);
		s.append(str3);
		System.out.println(s);
		
		//Split string
		
		String s1="you,can,do,it";
		String a[] =s1.split(",");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
