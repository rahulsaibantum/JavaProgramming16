package leetcodeproblems;
import java.util.*;
public class Problem1 
{
	
	    public static void res(int a[],int target)
	    {
	    	int sum[]=new int[2];
	        for(int i=0;i<a.length-1;i++)
	        {
	            if(a[i]+a[i+1]==target)
	            {
	                
	            }
	        }
	    }
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int targetvalue=sc.nextInt();
	        res(arr,targetvalue);
	    }
	}
