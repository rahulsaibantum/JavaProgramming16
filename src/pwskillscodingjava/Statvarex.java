package pwskillscodingjava;
public class Statvarex 
{
	
	public static void main(String[] args) {
		babu obj=new babu();
		obj.id=101;
		babu.company="itsolutions";
		obj.display();
	
	}
}
class babu
{
	static String company="chinna";
	int id;
	static
	{
		String company="rahul";
	}
	public  void display()
	{
		
		System.out.println(company+" "+id);
	}
}
