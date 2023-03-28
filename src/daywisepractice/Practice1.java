package daywisepractice;

public class Practice1 
{
	public static void main(String[] args) 
	{
		String s11="madam";
		String temp=s11;
		String s1="";
		for(int i=0;i<s11.length();i++)
		{
			s1=s1+s11.charAt(s11.length()-i-1);
		}
		if(s1.equals(temp))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("non-palindrome");
		}
	}
}
