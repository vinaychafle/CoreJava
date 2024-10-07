package stringdemo;

public class StringDemo2 {
	public static void main(String[] args) {
		
	
	String s="program";
	for(int i=0;i<=s.length()-1;i++)
	{
		System.out.println(s.charAt(i));
	}
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
}
}
