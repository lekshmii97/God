package array;

public class Elements {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	for(int i=0;i<a.length;i++)
	{
		System.out.println(" "+a[i]);
	}
	
	
	System.out.println(" "+"elements at odd");
	
for(int i=1;i<a.length;i=i+2)
{
	System.out.println(a[i]+" ");
}
	
	}
}

