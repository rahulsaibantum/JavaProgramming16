package pwskillscodingjava;

public class Massign1 {
	//PWSKILLS
	//SLLIKSPW
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("PWSKILLS");
		display(s);
		
	}
	public static void display(StringBuilder s)
	{
		s.reverse();
		s.setCharAt(s.length()-1, 'W');
		s.setCharAt(s.length()-2,'P');
		System.out.println(s);
		
	}

}
