package commandlinearguments;

public class FloatIntDoubleSum {

	public static void main(String[] args) {
	int a=Integer.parseInt( args[0]);
	float b=Float.parseFloat( args[1]);
	double c=Double.parseDouble( args[2]);
	double sum=a+b+c;
	System.out.println("sum="+sum);
	

	}

}
