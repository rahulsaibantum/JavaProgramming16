package dsa;
import java.util.*;
public class InsertionSorting2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Insert(a);
	}
	public static void Insert(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1])
			{
				for(int n:a)
				{
					System.out.print(n+" ");
				}
				System.out.println();
			}
			else
			{

				for(int j=i;j>0;j--)
				{
					int temp;
					if(a[j]<a[j-1])
					{
						temp=a[j-1];
						a[j-1]=a[j];
						a[j]=temp;
					}
				}
				for(int n:a)
				{
					System.out.print(n+" ");
				}
				System.out.println();
				
			}
		}
	}
}
		
