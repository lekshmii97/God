package Special;

public class PalindromeString {

	public static void main(String[] args) {
		String a="mom"; //original
		String rev=" ";//reverse
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		
		
		}
		System.out.println(rev);
		
		if(a.equals(rev))
		{
			System.out.print(" palindrome");
		}
	
		else
		{
			System.out.print("not palindrome");
		}
		
	}
		
}


