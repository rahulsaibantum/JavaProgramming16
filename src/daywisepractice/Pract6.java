package daywisepractice;
import java.util.*;
public class Pract6 
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	System.out.println("Enter number of Strings");
	int num=sc.nextInt();
	String arr[]=new String[num];
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter a String");
		arr[i]=sc.next();
	}
	System.out.println("Enter a string to search");
	String s=sc.next();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].equalsIgnoreCase(s))
		{
			found=true;
			System.out.println("City Found at Position:"+" "+i);
		}
		
	}
	if(!found)
	{
		System.out.println("city not found");
	}
	}

}
