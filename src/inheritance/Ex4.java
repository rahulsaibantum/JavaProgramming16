package inheritance;

class satellite
{
	 int display()
	{
		System.out.println("satellite class");
		return 10;
	}
}
class rocket extends satellite
{
	protected int display()
	{
		System.out.println("rocket class");
		return 15;
	}
}
class rocket1 extends satellite
{
	
}
public class Ex4 
{
	public static void main(String[] args) {
		rocket1 obj=new rocket1();
		obj.display();
		
	}
}
