

public class Pattern3 
{
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==(n-1)/2 && j<(n-1)/2)
                {
                    System.out.print("*"+" ");
                }
                else if(j==(n-1)/2)
                {
                    System.out.print("*"+" ");
                }
                else if(i>0&&j==0)
                {
                    System.out.print("*"+" ");
                }
                else if(i==0 && (j==(n-1)/2-1))
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
