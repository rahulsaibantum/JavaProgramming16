package pwskillscodingjava;
import java.util.*;
public class Methassign3 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res=DisplayMid(s);
		System.out.println(res);
	}
	static String DisplayMid(String s)
	{
		String res="";
		int halve=s.length()/2;
		if(s.length()%2==0)
		{
			
			res=res+(s.charAt(halve-1));
			res=res+(s.charAt(halve));
		}
		else
		{
			res+=s.charAt(halve);
		}
		return res;
	}

}
