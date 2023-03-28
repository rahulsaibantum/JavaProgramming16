package pwskillscodingjava;

import java.util.Scanner;

public class DuplicateChar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		isDuplicate(s);
	}
	public static void isDuplicate(String s)
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
				System.out.println((char)asciarr[i]);
			}
		}
		if(result)
		{
			System.out.println("String doesn't duplicate characters");
		}
		
	}

}
