import java.util.Scanner;
public class q2
{
	void area(double l, double b)
	{
		System.out.println("Area of rectangle=" + (l*b));
		System.out.println("Perimeter of rectangle=" + (2*(l+b)));
	}
	void area(double r)
	{
	    final double pi=3.14;
		System.out.println("Area of circle=" + (pi*r*r));
		System.out.println("Perimeter of circle=" + (2*pi*r));
	}
	void area(double a, double b, double c)
	{
		double s=(a+b+c)/2;
		double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle=" +ar);
		System.out.println("Perimeter of triangle=" +(a+b+c));
	}
}
public class Demo
{
	public static void main(String args[])
	{
		q2 ob = new q2();
		ob.area(1.5,1.6,1.7);
		ob.area(2.5);
		ob.area(3,9);
	}
}