package pwskillscodingjava;

public class M1 
{
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("Virat");
		StringBuilder s1=new StringBuilder("kohli");
		M1 obj=new M1();
		obj.m11(s,s1);
	}
	public void m11(StringBuffer s,StringBuilder s1)
	{
		s.append("kohli");
		System.out.println(s);
		s1.insert(0,"Virat");
		System.out.println(s1);
	}

}
