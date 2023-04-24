package controlstatements;

public class Grade {

	public static void main(String[] args) {
		int score=85;
		if(score>=80&&score<=100)
		{
			System.out.println("Grade A");
		}
		else if(score>=60&&score<=79)
		{
			System.out.println("Grade B");
		}
		else if(score>=40&&score<=59)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println();
		}
	}

}
