package pwskillscodingjava;
import java.util.*;
public class Massign4 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sorting(s);
	}
	public static void sorting(String s)
	{
		s=s.toLowerCase().replaceAll("\\s","");
		char[] arr=s.toCharArray();
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
		for(char i:arr)
		{
			System.out.print(i);
		}
		
	}

}
