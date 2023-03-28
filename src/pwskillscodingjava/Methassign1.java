package pwskillscodingjava;
import java.util.*;
public class Methassign1 
{
	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	Methassign1 obj=new Methassign1();
	int result=obj.Average(num1,num2,num3);
	System.out.println(result);
	}
	public int Average(int num1,int num2,int num3)
	{
		int sum=num1+num2+num3;
		int avg=sum/3;
		return avg;
	}

}
