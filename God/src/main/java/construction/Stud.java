package construction;

public class Stud {
	String name;
	int age;
	int sub;
	public Stud(String a,int b, int c)
	{
		name=a;
		age=b;
		sub=c;
	}
	
public void add()
{
	System.out.println(name+" "+age+" "+sub);
}
	public static void main(String[] args) {
Stud sc=new Stud("lekshmi",20,88);
sc.add();
	}

}
