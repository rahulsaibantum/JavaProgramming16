package pwskillscodingjava;
class student
{
	private int rollno;
	private String name;
	private  String college;
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCollege(String college)
	{
		this.college=college;
	}
	public String getCollege()
	{
		return college;
	}
}
public class Enexamp1
{
	public static void main(String[] args)
	{
		student obj=new student();
		
		obj.setRollno(505);
		obj.setName("rahul");
		obj.setCollege("UV");
		System.out.println(obj.getRollno()+" "+obj.getName()+" "+obj.getCollege());
	}
}