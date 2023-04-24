package scanner;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter a");
int a=sc.nextInt();
  System.out.println("enter b");
  int b=sc.nextInt();
  int temp;
  
  System.out.println("before swap a="+a+" "+"b="+b);
  
  temp=a;
  a=b;
  b=temp;
  
  System.out.println("after swaping a="+a+" "+"b="+b);
	}

}
