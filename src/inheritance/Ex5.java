package inheritance;
class demo
{
	int i;
	int j;
	demo()
	{
		System.out.println("No-arg Constructor in parent class constructor");
	}
	demo(int i,int j)
	{
		
		this.i=i;
		this.j=j;
		System.out.println("Argument constructor in parent class constructor");
	}
}
class demo1 extends demo
{
	int i;
	int j;
	demo1()
	{
		
		System.out.println("No-arg Constructor in child class constructor");
	}
	demo1(int x,int y)
	{
		
		x=i;
		y=j;
		System.out.println("Argument constructor in child class constructor");
	}
}
public class Ex5
{
	public static void main(String[] args)
	{
		demo1 obj=new demo1(10,100);
		
		
	}

}
