package dsa;
import java.util.Scanner;
public class Pattern1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			//R
			for(int j=0;j<n;j++)
			{
				if(i==0&&j<=(n-1)/2||j==(n-1)/2&&i<=(n-1)/2||j==0||i==(n-1)/2&&j<=(n-1)/2||i-j==(n-1)/2&&i>=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//A
			for(int j=0;j<n;j++)
            {
                if(i+j==(n-1)/2||j-i==(n-1)/2||i==((n+1)/2)/2
                 &&(j>((n-1)/2)/2&& j<=(n-1)-((n-1)/2)/2) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
			System.out.print(" ");
			//H
			for(int j=0;j<n;j++)
            {
                if(j==0||i==(n-1)/2&&j<=(((n-1)/2+2))||j==((n-1)/2)+2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
			System.out.print(" ");
			
			//U
			for(int j=0;j<n;j++)
			{
				if(j==0||j==(n-1)/2||i==(n-1)&&j<=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			//L
			for(int j=0;j<n;j++)
			{
				if(j==0||i==(n-1)&&j<=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.print("	");
			//S
			for(int j=0;j<n;j++)
			{
				if(i==0&&j<(n-1)/2||i==(n-1)&&j<(n-1)/2||j==0&&i<=(n-1)/2||i==(n-1)/2&&j<=(n-1)/2||j==(n-1)/2&&i>=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//A
			for(int j=0;j<n;j++)
            {
                if(i+j==(n-1)/2||j-i==(n-1)/2||i==((n+1)/2)/2
                 &&(j>((n-1)/2)/2&& j<=(n-1)-((n-1)/2)/2) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
			System.out.print(" ");
			//I
			for(int j=0;j<n;j++)
			{
				if(i==0&&j<=(n-1)/2||i==(n-1)&&j<=(n-1)/2||j==(n-1)/2/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			System.out.println();
				
		}
		
	}
}


