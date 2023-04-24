package swaping;

public class SwapwithTemp {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		int temp;
		System.out.println("Before swap a="+a+" "+"b="+b );
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap a="+a+" "+"b="+b);

	}

}
