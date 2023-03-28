package daywisepractice;
import java.util.*;
public class Pract3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows for 1st matrix");
		int rows=sc.nextInt();
		System.out.println("Enter no.of columns for 1st matrix");
		int columns=sc.nextInt();
		System.out.println("Enter no.of rows for 2nd matrix");
		int rows1=sc.nextInt();
		System.out.println("Enter no.of columns for 2nd matrix");
		int columns1=sc.nextInt();
		int a[][]=new int[rows][columns];
		int b[][]=new int[rows1][columns1];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix A is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix B is");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Multiplication is");
		int c[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				c[i][j]=0;
				for(int k=0;k<rows;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		}
}
