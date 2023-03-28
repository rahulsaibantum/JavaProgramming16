package polymorphism;
class demo
{
	public void section()
	{
		System.out.println("demo Class");
	}
	public void timeOut()
	{
		System.out.println("demo class");
	}
}
class demo1 extends demo
{
	public void section()
	{
		System.out.println("demo1 class");
	}
	public void timeOut()
	{
		System.out.println("demo1 class");
	}
}
class demo2 extends demo
{
	public void section()
	{
		System.out.println("demo2 class");
	}
	public void timeOut()
	{
		System.out.println("demo2 class");
	}
}
class demo3 extends demo
{
	public void section()
	{
		System.out.println("demo3 class");
	}
	public void timeOut()
	{
		System.out.println("demo3 class");
	}
}
class poly
{
	public void poly1(demo d0)
	{
		d0.section();
		d0.timeOut();
	}
}
public class P2 
{
	public static void main(String[] args) {
		demo d=new demo();
		demo1 d1=new demo1();
		demo2 d2=new demo2();
		demo3 d3=new demo3();
		poly p=new poly();
		p.poly1(d1);
		p.poly1(d2);
		p.poly1(d3);
	}

}
