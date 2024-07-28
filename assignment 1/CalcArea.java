class CalcArea
{
	public void area(double r)
	{
		double ar=3.14*r*r;
		System.out.println("Area of the Circle =" + ar);
		
		System.out.println("Perimeter of the Circle =" + (2*3.14*r));
	}
	public void area(double L, double B)
	{
		double ar=L*B;
		System.out.println("Area of the Rectangle =" + ar);
		System.out.println("Perimeter of the Rectangle =" + (2*(L+B)));
	}
	public void area(double a, double b, double c)
	{
		double s= (a+b+c)/2;
		double ar= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the Triangle ="+ar);
		System.out.println("Perimeter of the Triangle =" + (a+b+c));
	}
}
class Demo
{
	public static void main(String[] args)
	{
		CalcArea ob = new CalcArea();
		ob.area(7.56);
		ob.area(5.36,3.5);
		ob.area(3,4,5);
	}
}