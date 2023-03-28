package lambdaexpressions;
import java.util.*;
@FunctionalInterface
interface even
{
	void isEven(int num);
}
public class Annonymousclass1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		even obj= (int num1)->
		{
			if(num1%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		};
				obj.isEven(num);
		
	}
}