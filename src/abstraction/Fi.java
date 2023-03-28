package abstraction;
abstract class human
{
	final int id=9798;
	human()
	{
		System.out.println("human class");
	}
	final public void eat()
	{
		
		System.out.println("eating");
	}
	final public void sleep()
	{
		System.out.println("sleeping");
	}
}
class rahul extends human
{
	
}
public class Fi 
{
	public static void main(String[] args) {
		rahul ref=new rahul();
		ref.eat();
		ref.sleep();
	}

}
