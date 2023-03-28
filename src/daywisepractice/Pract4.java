package daywisepractice;
public class Pract4 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][];
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[4];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=5;
		a[2][0]=6;
		a[2][1]=7;
		a[2][2]=8;
		a[2][3]=9;
		for(int i=0;i<2;i++)
		{
			System.out.print(a[0][i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			System.out.print(a[1][i]+" ");
		}
		System.out.println();
		for(int i=0;i<4;i++)
		{
			System.out.print(a[2][i]+" ");
		}
	}
	
}
