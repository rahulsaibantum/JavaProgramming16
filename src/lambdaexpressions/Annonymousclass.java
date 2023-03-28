package lambdaexpressions;
@FunctionalInterface
interface human
{
	void listen();
}

public class Annonymousclass
{
	public static void main(String[] args) {
		human obj=new human()
				{
			public void listen()
			{
				System.out.println("listening..");
			}
				};
		
				
				obj.listen();
		
	}
}