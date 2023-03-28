package pwskillscodingjava;
import java.util.Scanner;
public class MaxOccuringString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		maxString(s);
	}
	public static void maxString(String s)
	{
		//rahulsai
		s=s.toLowerCase().replaceAll("\\s","");
		char[] arr=new char[s.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.charAt(i);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int[] arr1=new int[s.length()];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			arr1[i]=count;
		}
		
		int max=Integer.MIN_VALUE;
		char ch='0';
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>=max)
			{
				max=arr1[i];
				ch=arr[i];
			}
		}
		System.out.println(ch);
		
		
		
		
		
	}

}
