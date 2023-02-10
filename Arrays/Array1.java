import java.util.Scanner;
public class Array1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.next();
        }
       for(String s1:s)
       {
        System.out.println(s1);
       }
    }
}