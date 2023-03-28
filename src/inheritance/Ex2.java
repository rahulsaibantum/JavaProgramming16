package inheritance;
/*Single or Simple Inheritance
class Company
{
	int clid;
	String cliname;
	void displayDetails()
	{
		clid=500;
		cliname="amdocs";
	}
}
class Employee extends Company
{
	
}
public class Ex2
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.displayDetails();
	}

}*/
/* Multi-level Inheritance
class Director
{
	int eventId;
	String eventName;
	public void displayDetails()
	{
		eventId=101;
		eventName="fest";
		System.out.println(eventId);
		System.out.println(eventName);
	}
}
class Principal extends Director
{
	
}
class HOD extends Principal
{
	
}
class Lecturer extends HOD
{
	
}
class Student505 extends Lecturer
{
	
}
public class Ex2
{
	public static void main(String[] args) {
		Student505 s=new Student505();
		s.displayDetails();
	}
}*/
/*Hierarichal Inheritance
class Manager
{
	int batchno;
	String batchname;
	public void displayDetails()
	{
		batchno=111;
		batchname="Binary";
	}
}
class HR extends Manager
{
	
}
class Lead extends Manager
{
	
}
class employee extends Manager
{
	
}
public class Ex2
{
	public static void main(String[] args) {
		employee obj=new employee();
		obj.displayDetails();
	}
}*/
/*Multiple Inheritance cannot be acheived
class Manager1
{
	int empid=505;
}
class Manager2
{
	int empid=5055;
}
class Employee5 extends Manager1,Manager2
{
	
}
public class Ex2
{
	public static void main(String[] args) {
		employee obj=new employee();
		obj.displayDetails();
	}
}*/

