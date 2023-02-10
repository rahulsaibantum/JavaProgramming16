import java.util.*;
class Conditional1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result=" ";
        for(int i=1;i<=n;i++)
        {
            String s1=String.valueOf(i);
             result=(i%3==0)?((i%5==0)?"Fizzbuzz":"Fizz"):(i%5==0)?"Buzz":s1;
             System.out.println(result);
        }
        
    }
}