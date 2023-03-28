package pwskillscodingjava;
import java.util.*;
public class Methassign4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		FindLeap(num);
	}
	public static void FindLeap(int num)
	{
		if(num%100==0)
		{
			if(num%4==0 &&num%400==0)
			{
				System.out.println("True");
			}
			else 
			{
				System.out.println("False");
			}
		}
		else if(num%100!=0)
		{
			if(num%4==0 && num%400!=0)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
	}
}
