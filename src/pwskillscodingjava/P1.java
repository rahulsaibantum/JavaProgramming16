package pwskillscodingjava;
import java.util.*;
public class P1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		isPrime(n);
		
	}
	public static void isPrime(int n)
	{
		
		
			for(int i=2;i<=n;i++)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print(i+" ");
				}
			}
			
		
		
	}
}
