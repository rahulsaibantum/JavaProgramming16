package dsa;
import java.util.*;
public class InsertionSorting1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=a[a.length-1];
		int j=0;
		for(int i=a.length-1-j;i>=0;i--)
		{
			if(i>0)
			{
				if(temp<a[i-1])
				{
					a[i]=a[i-1];
					for(int k=0;k<a.length;k++)
					{
						System.out.print(a[k]+" ");
					}
					System.out.println();
				}
				else 
				{
					a[i]=temp;
					for(int k=0;k<a.length;k++)
					{
						System.out.print(a[k]+" ");
					}
					System.out.println();
					break;
				}
				j++;
			}
			else
			{
				a[i]=temp;
				for(int k=0;k<a.length;k++)
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
				break;

			}
			
		}
	}

}
