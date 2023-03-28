package dsa;
public class MagicSquare 
{
	public static void main(String[] args) {
		int[][] a= {{5,3,4},{1,5,8},{6,4,2}};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<3;i++)
		{
			int sum=0;
			//rows
			for(int j=0;j<3;j++)
			{
				sum+=a[i][j];
			}
			if(sum>=max)
			{
				max=sum;
			}
			int sum1=0;
			//cols
			for(int j=0;j<3;j++)
			{
				sum1+=a[j][i];
			}
			if(sum1>=max)
			{
				max=sum1;
			}
		}
		//diagonals
		int sum2=0;
		int sum3=0;
		for(int i=0;i<3;i++)
		{
			//dia
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					sum2+=a[i][j];
				}
			}
			if(sum2>=max)
			{
				max=sum2;
			}
			for(int k=0;k<3;k++)
			{
				if(i+k==a.length-1)
				{
					sum3=sum3+a[i][k];
				}
			}
			if(sum3>=max)
			{
				max=sum3;
			}
			
		}
		System.out.println(max);
		
	}

}
