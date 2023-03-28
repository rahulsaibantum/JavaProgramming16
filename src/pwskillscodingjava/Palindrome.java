package pwskillscodingjava;
import java.util.*;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		isPalindrome(s);
		
	}
	public static void isPalindrome(String s)
	{
		String result="";
		for(int i=0;i<s.length();i++)
		{
			result+=s.charAt(s.length()-i-1);
		}
		if(result.equals(s))
		{
			System.out.println(result+" "+"is palindrome");
		}
		else
		{
			System.out.println(result+" "+"is not a palindrome");
		}
		
	}

}
