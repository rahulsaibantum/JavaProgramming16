import java.util.*;
class Demo
{
    public int temp(int a[])
    {
        int res=0;
        for(int num:a)
        {
            res+=num;
        }
        return res;
    }
}
public class Array4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Demo obj=new Demo();
       int res= obj.temp(new int[]{5,4});
       System.out.println(res);
        
    }
}