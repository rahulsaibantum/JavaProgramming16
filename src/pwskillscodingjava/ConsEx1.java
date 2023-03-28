package pwskillscodingjava;
class player
{
	private int no;
	private String name;
	private String team;
	player()
	{
		System.out.println("defaultConstructor");
	}
	player(int no,String name,String team)
	{
		this.no=no;
		this.name=name;
		this.team=team;
	}
	public void display()
	{
		System.out.println(no+" "+name+" "+team);
	}
	
}
public class ConsEx1
{
	public static void main(String[] args)
	{
		player obj=new player();
		player obj1=new player(18,"virat","rcb");
		
		obj1.display();
		
		
	}

}
