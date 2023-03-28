package pwskillscodingjava;
import java.util.*;
public class Frequency
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		countNumber(s);
	}
	public static void countNumber(String s)
	{
		s=s.toLowerCase().replaceAll("\\s","");
		int vowelCount=0;
		int consonantCount=0;
		int specialCharCount=0;
		int numberCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowelCount++;
			}
			else if(s.substring(i,i+1).matches("[^a-z0-9]"))
			{
				specialCharCount++;
			}
			else if(s.substring(i,i+1).matches("[0-9]"))
			{
				 numberCount++;
			}
			else
			{
				consonantCount++;
			}
		}
		System.out.print("VowelCount="+vowelCount+" "+"ConsonantCount="+" "+consonantCount+" "+"SpecialCharctersCount="+" "+specialCharCount);
	}

}

