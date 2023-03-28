package daywisepractice;

public class Pract11
{
	public static void main(String[] args) {
		int a[]=new int[10];
		try
		{
			System.out.println("starting");
			a[10]=99;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("remaining code");
		
	}

}
