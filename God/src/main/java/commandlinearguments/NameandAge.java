package commandlinearguments;

public class NameandAge {

	public static void main(String[] args) {

		System.out.println( args[0]);
		int age=Integer.parseInt( args[1]);
		System.out.println("age="+age);

	}

}
