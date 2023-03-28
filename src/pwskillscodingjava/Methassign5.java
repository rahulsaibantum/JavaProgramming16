package pwskillscodingjava;
import java.util.*;
public class Methassign5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println(Findsum(num1,num2,num3));
	}
	public static int Findsum(int num1,int num2,int num3)
	{
		int res;
		
		if(num1==num2 && num2==num3)
		{
			res=num1;
			return res;
		}
		else 
		{
			if(num1<num2&&num1<num3)
			{
				res=num1;
			}
			else if(num2<num3)
			{
				res=num2;
			}
			else 
			{
				res=num3;
			}
			return res;
		}
		
	}

}
