package pwskillscodingjava;
import java.util.*;
public class Methassign2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s.toLowerCase();
		int res=FindVowels(s);
		System.out.println(res);
	}
	public static int FindVowels(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'|s.charAt(i)=='e'|s.charAt(i)=='i'|s.charAt(i)=='o'|s.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}

}
