package helloworld;

public class IfElseOperator {

	public static void main(String[] args) 
	{
		int a=5;
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		int b=4;
		if(b==0)
			System.out.println("Neither Even nor Odd");
		else
			if(b%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		/*
		 * OR
		 */
		int c=0;
		if(c==0)
			{System.out.println("Neither Even nor Odd");
		    System.out.println("Nothing");}
		else if(c%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
