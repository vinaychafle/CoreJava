package stringdemo;

public class StringDemo1 {
	public static void main(String[] args) {
		String s1="java";
		String s2="program";
		
		String s3=new String("JAVA");
		System.out.println(s2);
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.length());
		String documentID="329472";
		String id="checkbox-realtime"+documentID;
		System.out.println(id);
	}
}
//String can be written in two types
