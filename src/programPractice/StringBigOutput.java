package programPractice;

public class StringBigOutput {
public static void main(String[] args) {
	
	String s="Boy is Good";
	String desired="";
	String word[]=s.split(" ");
	for(int i=0;i<word.length;i++)
	{
		desired=desired+word[i].charAt(0);
		
		
	}
	System.out.println(desired);
	
	String name="my name is vinay chafle";
	String splited[]=name.split(" ");
	String output="";
	
	for(int i=splited.length-1;i>=0;i--)
	{
		output=output+splited[i]+" ";
		
	}
	System.out.println(output);
}
}
