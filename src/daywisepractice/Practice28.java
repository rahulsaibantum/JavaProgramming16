package daywisepractice;
import java.util.*;
public class Practice28 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bill=sc.nextInt();
		int discount;
		if(bill>999)
		{
			if(bill>=1000&&bill<5000)
			{
				discount=(bill/100)*10;
				System.out.println(bill-discount);
			}
			else if(bill>=5000&&bill<8000)
			{
				discount=(bill/100)*15;
				
				System.out.println(bill-discount);
			}
			else if(bill>=8000&&bill<10000)
			{
				discount=(bill/100)*20;
				System.out.println(bill-discount);
			}
			else if(bill>=10000&&bill<50000)
			{
				discount=(bill/100)*25;
				System.out.println(bill-discount);
			}
			else
			{
				discount=(bill/100)*40;
				System.out.println(bill-discount);
			}
		}

	else
	{
		System.out.println(bill);
	}
	
	
		
		
	}
}

