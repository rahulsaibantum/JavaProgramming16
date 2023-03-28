package pwskillscodingjava;
class Employee
{
	private int id;
	private String company;
	public Employee()
	{
		System.out.println("Default constructor is called");
		id=505;
		company="tcs";
	}
	Employee(String company)
	{
		this.company=company;
	}
	Employee(int id,String company)
	{
		this.id=id;
		this.company=company;
	}
	public void display()
	{
		System.out.println(id+" "+company);
	}
}
public class ConsEx2 
{
	public static void main(String[] args)
	{
		Employee obj=new Employee();
		Employee obj1=new Employee("Deloitte");
		Employee obj2=new Employee(500,"Tata");
		obj.display();
		obj1.display();
		obj2.display();
		
	}

}
