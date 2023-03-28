package daywisepractice;

public class Practice 
{
	public static void main(String[] args) 
	{
		int n=10;
		int num1=0;
		int num2=1;
		int sum=num1+num2;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		System.out.print(sum+" ");
		int count=3;
		while(count<n)
		{
			num1=num2;
			num2=sum;
			sum=num1+num2;
			System.out.print(sum+" ");
			count++;
		}
	}
			
}
