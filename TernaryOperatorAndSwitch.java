package helloworld;

public class TernaryOperatorAndSwitch {

	public static void main(String[] args) 
	
	{
		int a=8;
		int b=5;
		if(a>5)
			b=1;
	    else
			b=0;
		System.out.println(b);
		
		//OR using ternary operator// ?:
		
		b=a>5?1:0;
		System.out.println(b);
		
		// switch
		
		int n=6;
		if(n==1)
		System.out.println("one");
		else if(n==2)
		System.out.println("two");
		else if(n==3)
		System.out.println("three");
		else if(n==4)
		System.out.println("four");
		else if(n==5)
		System.out.println("five");
		else 
		System.out.println("No match");
		
		//OR using switch
		
		/* we can pass integer
		 * we can pass char (Because characters later converted to number in ASCII)
		 * we can't pass double
		 * we can pass string on compiler version of 1.7 and later but not older version
		 * 
		 */
		int m=3; // we are passing integer data type
		
		switch(m)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("No match");
			
			}
		
		
		
	
	
	}

}
