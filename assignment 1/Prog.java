public class Prog
{
    void Largest(int a,int b, int c)
	{
		if(a>b && a>c)
		{
		  System.out.println("Largest number is: "+a);
		}
		else if(b>a && b>c)
		{
		  System.out.println("Largest number is: "+b);
		}
		else if(c>b && c>a)
		{
		  System.out.println("Largest number is: "+c);
		}
	}
	void Smallest(int a,int b, int c)
	{
		if(a<b && a<c)
		{
		  System.out.println("Smallest number is: "+a);
		}
		else if(b<a && b<c)
		{
		  System.out.println("Smallest number is: "+b);
		}
		else if(c<b && c<a)
		{
		  System.out.println("Smallest number is: "+c);
		}
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Prog ob = new Prog();
		ob.Largest(3,4,6);
		ob.Smallest(5,8,9);
	}
}