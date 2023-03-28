package lambdaexpressions;

class A
{
	public void display()
	{
		System.out.println("In A class");
	}
	class B
	{
		public void show()
		{
			System.out.println("In B class");
		}
	}
	class C
	{
		public void watch()
		{
			System.out.println("In C class");
		}
	}
}
public class Innerclass1
{
	public static void main(String[] args) {
		A obj=new A();
		A.B obj1=obj.new B();
		A.C obj2=obj.new C();
		obj.display();
		obj1.show();
		obj2.watch();
	}
}
