package controlstatement;

public class ForLoopDemo {
public static void main(String[] args) {
	for(int i=1;i<=10; i++)
	{
		System.out.println("2*"+i+"="+(2*i));
	}
	System.out.println("====================");
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
	}
	System.out.println("============odd number========");
	for(int i=1;i<15;i+=2)
	{
		System.out.println(i);
	}
	System.out.println("=========5to1===========");
	for(int i=5;i>=1;i--)
	{
		System.out.println(i);
	}
	System.out.println("=========even number===========");
	for(int i=1;i<=5;i++)
	{
		System.out.println(2*i);
	}
	System.out.println("====================");
	
}
}
//3 5 7 9 11
//1 5 2 10 3 15 4 20 5 25 6 30