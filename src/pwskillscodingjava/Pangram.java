package pwskillscodingjava;
public class Pangram 
{
	//The quick brown fox jumps over the lazy dog.
	public static void main(String[] args) 
	{
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(isPangram(s));
	}
	public static String isPangram(String s)
	{
		s=s.toUpperCase().replaceAll("\\s","");
		boolean result=true;
		String res="";
		char arr[]=new char[s.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.charAt(i);
		}
		char arr1[]=new char[26];
		for(int i=0;i<arr.length;i++)
		{
			int res1=arr[i]-65;
			arr1[res1]++;
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==0)
			{
				result=false;
			}
		}
		if(result==false)
		{
			res+="Non-Pangram";
		}
		else
		{
			res+="Pangram";
		}
		return res;
	}

}
