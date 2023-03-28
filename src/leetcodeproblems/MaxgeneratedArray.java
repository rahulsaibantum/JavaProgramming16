package leetcodeproblems;
import java.util.*;
public class MaxgeneratedArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		getMaximumGenerated(n);
		
	}
	public static void getMaximumGenerated(int n)
	{
		int a[]=new int[n+1];
		a[0]=0;
		a[1]=1;
		int h=n/2;
		for(int i=1;i<=h;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(j==0 &&(i*2<a.length) )
				{
					a[i*2]=a[i];
				}
				else if(j==1 && (i*2+1)<a.length)
				{
					a[(i*2)+1]=a[i]+a[i+1];
				}
			}
		}	
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
