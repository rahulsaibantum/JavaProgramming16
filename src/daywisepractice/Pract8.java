package daywisepractice;
public class Pract8 
{
	int r=3;
	int h=9;
	public void area()
	{
		System.out.println("Circle="+3.14*r*r*h);
	}
}
class square extends Pract8
{
	int s=5;
	public void area()
	{
		System.out.println("square="+s*s);
	}
}
class rectangle extends Pract8
{
	int l=5;
	int b=5;
	public void area()
	{
		System.out.println("rectangle="+l*b*h);
	}
}
class test
{
	public static void main(String[] args) {
		Pract8 obj=new Pract8();
		obj.area();
		square obj1=new square();
		obj1.area();
		rectangle obj2=new rectangle();
		obj2.area();
	}
}