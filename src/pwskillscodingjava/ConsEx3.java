package pwskillscodingjava;
class Employee1
{
	private int id;
	private String company;
	Employee1()
	{
		this(50050,"null");
		
		id=5059;
		company="cit";
	}
	public void Employee1(int id)
	{
		
		this.id=id;
	}
	Employee1(int id,String company)
	{
		
		this.id=id;
		this.company=company;
	}
	public void display()
	{
		
		
		System.out.println(id+" "+company);
	}
}
/*
public class ConsEx3 
{
	public static void main(String[] args) {
		Employee1 obj=new Employee1();
		Employee1 obj1=new Employee1(505);
		Employee1 obj2=new Employee1(50090,"Tcs");
		obj.display();
		obj1.display();
		obj2.display();
	}
}*/
	public class ConsEx3
	   {
		 int id;
		 String name;
		public static void main(String[] args)
		{
			 
			 ConsEx3 obj=new ConsEx3();
			System.out.println(obj.id);
			System.out.println(obj.name);
		}
	}



