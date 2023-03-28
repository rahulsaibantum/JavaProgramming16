package dsa;
import java.util.*;
public class Stack
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of stack");
		int n=sc.nextInt();
		Stack obj=new Stack();
		System.out.println("Enter elements needed to push");
		obj.push(n);
		System.out.println("Element that are removed");
		System.out.println(obj.pop());
		System.out.println("Elements Of the stack are");
		obj.show();
	}
	int s=sc.nextInt();
	int a[]=new int[s];
	int top=0;
	public void push(int ele)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			top++;
		}
	}
	public int pop()
	{
		int data;
		top--;
		data=a[top];
		a[top]=0;
		return data;
	}
	public void show()
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	
}