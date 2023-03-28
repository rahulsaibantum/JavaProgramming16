package pwskillscodingjava;
public class M2 
{
	public static void main(String[] args)
	{
		 final StringBuilder s=new StringBuilder("Rahul");
		
		M2 obj=new M2();
		obj.display(s);
		
	}
	public void display(StringBuilder s)
	{
		s.append("sai");
		s.insert(0, "KL");
		s.delete(8,11);
		System.out.println(s);
	}

}
