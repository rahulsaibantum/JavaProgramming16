package pwskillscodingjava;
public class M3
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer();
		display(s);
	}
	public static void display(StringBuffer s)
	{
		//capacity & length
		s.append("rahulsai");
		System.out.println(s.capacity());
		System.out.println(s.length());
	}

}
