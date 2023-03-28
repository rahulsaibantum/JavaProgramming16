package pwskillscodingjava;
import java.util.*;
public class Anagram 
{
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		String res=isAnagram(s,s1);
		System.out.println(res);
	}
	public static String isAnagram(String s,String s1)
	{
		String result=" ";
		boolean stmt=true;
		s=s.toLowerCase().replaceAll("\\s","");
		s1=s1.toLowerCase().replaceAll("\\s","");
		if(s.length()!=s1.length())
		{
			stmt=false;
		}
		else
		{
			char arr[]=new char[s.length()];
			char arr1[]=new char[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.charAt(i);
			}
			for(int i=0;i<arr1.length;i++)
			{
				arr1[i]=s.charAt(i);
			}
			for(int i=0;i<arr.length;i++)
			{
				char temp;
				for(int j=0;j<arr.length-1;j++)
				{
					if(arr[j]>arr[j+1])
					{
						temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<arr1.length;i++)
			{
				char temp;
				for(int j=0;j<arr1.length-1;j++)
				{
					if(arr1[j]>arr1[j+1])
					{
						temp=arr1[j+1];
						arr1[j+1]=arr1[j];
						arr1[j]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=arr1[i])
				{
					stmt=false;
					break;
				}
			}
		}
		if(stmt)
		{
			result+="Anagram";
		}
		else
		{
			result+="Non-Anagram";
		}
		return result;
	}

}
