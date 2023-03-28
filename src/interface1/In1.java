package interface1;
interface Animal
{
	void displayDetails();
}
interface wildAnimal
{
	
}
class list implements Animal,wildAnimal
{
	public void displayDetails()
	{
		System.out.println("Dog");
	}
	public void show()
	{
		System.out.println("Lion");
	}
}
public class In1
{
	public static void main(String[] args) 
	{
		list obj=new list();
		obj.displayDetails();
		obj.show();
	}
}