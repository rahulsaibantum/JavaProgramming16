package daywisepractice;
import java.util.*;
public class Pract2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
		int num=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num);
		int count=3;
		while(count<n)
		{
			num1=num2;
			num2=num;
			num=num1+num2;
			System.out.println(num);
			count++;
		}
	}
}
