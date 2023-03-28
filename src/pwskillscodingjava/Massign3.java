package pwskillscodingjava;
import java.util.*;
public class Massign3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new String(sc.nextLine());
		String str1[]=new String[str.length()];
		display(str1,str);
	}
	public static void display(String[] str1,String str)
	{
		str1=str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
			String str3=String.valueOf(str1[i]);
			str3=str3.toLowerCase();
			for(int j=str3.length()-1;j>=0;j--)
			{
				System.out.print(str3.charAt(j)+"");
			}
			System.out.print(" ");
		}
		
	}

}
