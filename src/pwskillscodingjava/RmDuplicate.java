package pwskillscodingjava;
import java.util.*;
public class RmDuplicate
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		rmDup(s);
	}
	public static void rmDup(String s)
	{	
		s=s.toLowerCase().replaceAll("\\s","");
		char[] a1=new char[s.length()];
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=s.charAt(i);
		}
		int[] a2=new int[s.length()];
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++)
		{
			int temp;
			for(int j=0;j<a2.length-1;j++)
			{
				if(a2[j]>a2[j+1])
				{
					temp=a2[j+1];
					a2[j+1]=a2[j];
					a2[j]=temp;
				}
			}
		}
		for(int i=0;i<a2.length-1;i++)
		{
			if(a2[i]==a2[i+1])
			{
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(i)==(char)a2[i+1])
					{
						char s1=s.charAt(i);
						s1='\0';
					}
				}
			}
		}
		System.out.println(s1);
		
							
	}

}
