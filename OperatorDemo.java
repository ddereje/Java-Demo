package helloworld;

public class OperatorDemo {

	public static void main(String[] args) 
	{
		/*
		 * Arithmetic +,-,*,/,%
		 * if else operator
		 * relational
		 * logical
		 * 
		 * 
		 * 
		 */
		int m=6,n=4;
		int r1= m+n;
		int r2= m-n;
		int r3= m*n;
		double r4= (double)m/n;
		int r5= m%n; 
	
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

		int a=4;
		int b=5;
		int c=6;
		int d=8;
		a-=6;// a=a-6
		b+=4;// b=b+4// b=9
		c+=b;// c=c+b// c=15
		c++;// c=c+1// increment//short hand operator// c= 16
		d--;// d=d-1// post decrement( d=7)
		--d;// d=(d-1)-1 pre decrement(d=6)
		int e=7;
		e=--d;// e is decremented(e=5) And d=5
		int f=10;
		f=d--;// f is not decremented (f=5) And d=4
		
		 System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         
         System.out.println(e);
 		 System.out.println(f);
 		 
 		 int x;
 		 x=34;
 		 System.out.println(x);
		
	}

}
