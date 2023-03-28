package inheritance;
class Teacher
{
	int studentrollno;
	String studentname;
	Teacher()
	{
		System.out.println("Teacher class");
	}
	public void displayDetails()
	{
		studentrollno=505;
		studentname="rahulsaibantumilli";
		System.out.println(studentrollno+" "+studentname);
	}
}
class Student extends Teacher
{
	/*
	public Student()
	{
		super();
	}*/
}
public class Ex1
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.displayDetails();
	}
}