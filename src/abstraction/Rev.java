package abstraction;
import java.util.*;
abstract class Shape
{
	 float area;
	abstract void input();
	abstract void compute();
	public  void display()
	{
		System.out.println("Area is"+area);
	}
}
class Rectangle extends Shape
{
	float length;
	float breadth;
	void input()
	{
		System.out.println("Rectangle Application");
		Scanner sc=new Scanner(System.in);
		length=sc.nextFloat();
		breadth=sc.nextFloat();
	}
	void compute()
	{
		area=length*breadth;
	}
	
	
}
class Square extends Shape
{
	float length;
	void input()
	{
		System.out.println("Square Application");
		Scanner sc=new Scanner(System.in);
		length=sc.nextFloat();
		
	}
	void compute()
	{
		area=length*length;
	}
	
	
}
class Circle extends Shape
{
	float radius;
	void input()
	{
		System.out.println("Circle Application");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextFloat();
	}
	void compute()
	{
		area=(3.14f*radius*radius);
	}
}
class Triangle extends Shape
{
	float length;
	float height;
	void input()
	{
		System.out.println("Triangle Application");
		Scanner sc=new Scanner(System.in);
		length=sc.nextFloat();
		height=sc.nextFloat();
	}
	void compute()
	{
		 area=(length*height);
	}
}
class demo
{
	public void poly(Shape ref)
	{
		ref.input();
		ref.compute();
		ref.display();
	}
}
public class Rev 
{
	public static void main(String[] args) {
		demo d=new demo();
		Rectangle r=new Rectangle();
		Square s=new Square();
		Circle c=new Circle();
		Triangle t=new Triangle();
		d.poly(r);
		d.poly(s);
		d.poly(c);
		d.poly(t);
	}

}


































