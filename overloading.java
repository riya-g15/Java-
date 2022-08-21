import java.util.*;
import java.lang.Math;
class overloading
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Choose the desired function: \n 1.Display1\n 2.Display2 \n");
		int num=sc.nextInt();
		polymorphism p=new polymorphism();
		switch(num)
		{
		case 1:
			System.out.print("Enter a number: ");
			int n=sc.nextInt();
			System.out.print("Enter a character:  ");
			char ch=sc.next().charAt(0);
			p.display(n,ch);
			break;
		case 2:
			System.out.print("Enter a number to check if number if Pronic or not : ");
			n=sc.nextInt();
			p.display(n);
		}
	}
}

class polymorphism
{
	void display(int a,char ch)
	{
		if(ch=='c')
			System.out.println(Math.cbrt(a));
		else 
			System.out.println(Math.sqrt(a));
	}

	void display(int a)
	{
		int b=(int)Math.sqrt(a);
		if(a/b==(b+1))
		System.out.println("IT is pronic");
		else
		System.out.println("IT is not pronic");
		
	}
}
