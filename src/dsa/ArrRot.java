package dsa;
import java.util.*;
public class ArrRot {
    public static void rotate(int[] nums, int k) 
    {
        for(int i=0;i<k;i++)
        {
            int temp=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--)
            {
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
        for(int i:nums)
        {
        	System.out.print(i+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       
        rotate(nums,k);
    }
}
























/*
import java.util.*;
public class ArrRot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int nor=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		code(a,nor);
	}
	public static void code(int a[],int nor)
	{
		for(int i=0;i<nor;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for(int n:a)
		{
			System.out.print(n+" ");
		}
	}
}*/


