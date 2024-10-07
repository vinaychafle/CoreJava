package programPractice;

public class ReverseString {
public static void main(String[] args) {
	
	String s="world";
	String e="";
	for(int i=s.length()-1;i>=0;i--)
	{
		char ch=s.charAt(i);
		e=e+ch;
	}
	System.out.println(e);
	
	StringBuilder sb = new StringBuilder("hello world");
	sb.reverse();
	String reversedString = sb.toString();
	System.out.println(reversedString);
		}
	

}

