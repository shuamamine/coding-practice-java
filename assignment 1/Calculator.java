import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		int a,b,ch,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		a = sc.nextInt();
		System.out.println("Enter value of b: ");
		b = sc.nextInt();
		System.out.println("Enter choice\n");
		System.out.println("Enter 1 for addition \n");
	    System.out.println("Enter 2 for subtraction \n");
		System.out.println("Enter 3 for multiplication \n");
		System.out.println("Enter 4 for division \n");
		System.out.println("Enter 5 for remainder \n");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Sum= "+(a+b));
			break;
			
			case 2:
			System.out.println("Difference= "+(a-b));
			break;
			
			case 3:
			System.out.println("Product= "+(a*b));
			break;
			
			case 4:
			if(b!=0)
			{
				System.out.println("Quotient= "+(a/b));
			}
			break;
			
			case 5:
			if(b!=0)
			{
				System.out.println("Remainder= "+(a%b));
			}
			break;
			
			default: 
			System.out.println("Invalid Input");
		}
		}
		}
			