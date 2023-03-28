package besantjavatraining;
import java.util.*;
public class Meth1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int res=Display(num);
		Dis();
		System.out.println(res);
		int res1=Arrsum(a);
		System.out.println(res1);
	}
	public static int Display(int num)
	{
		return num;
	}
	public static void Dis()
	{
		System.out.println("Method with no body");
	}
	public static int Arrsum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
