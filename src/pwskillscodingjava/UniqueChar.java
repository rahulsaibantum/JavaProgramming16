package pwskillscodingjava;
import java.util.*;
public class UniqueChar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		isUnique(s);
	}
	public static void isUnique(String s)
	{
		//rahulsai
		s=s.toLowerCase().replaceAll("\\s","");
		char[] arr=new char[s.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.charAt(i);
		}
		int[] asciarr=new int[arr.length];
		for(int i=0;i<asciarr.length;i++)
		{
			asciarr[i]=arr[i];
		}
		for(int i=0;i<asciarr.length;i++)
		{
			int temp;
			for(int j=0;j<asciarr.length-1;j++)
			{
				if(asciarr[j]>asciarr[j+1])
				{
					temp=asciarr[j+1];
					asciarr[j+1]=asciarr[j];
					asciarr[j]=temp;
				}
			}
		}
		boolean result=true;
		for(int i=0;i<asciarr.length-1;i++)
		{
			if(asciarr[i]==asciarr[i+1])
			{
				result=false;
				break;
			}
		}
		if(result)
		{
			System.out.println(s+" "+"contains unique characters");
		}
		else
		{
			System.out.println(s+" "+"doesn't contain unique characters");
		}
		
		
	}

}
