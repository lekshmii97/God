package scanner;

import java.util.Scanner;

public class Area{

public static void main(String[] args)
{
	
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter breadth");
	
	int b=ob.nextInt();
	 
	System.out.println("enter height");
	int h=ob.nextInt();
	
	float a=(b*h)/2;
	
	System.out.println("area="+a);
	}
	
	
	

}
