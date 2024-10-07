package basics;

public class CommandLineArgument {
public static void main(String[] args) {
	System.out.println("there are"+args.length+ " command line arguemnt");
	
	System.out.println("passed parameters are :");
	for (int i = 0; i < args.length; i++) {
		System.out.println(args [i]);
	}
}
}
