package abstraction;
abstract class Aero
{
	abstract public void takeOff();
	
	abstract public void fly();
}
class cargo extends Aero
{
	public void takeOff()
	{
		System.out.println("cargoplane carries goods");
	}
	public void fly()
	{
		System.out.println("cargoplane flies at low height");
	}
	public void alert()
	{
		System.out.println("cargoo");
	}
}
class passenger extends Aero
{
	public void takeOff()
	{
		System.out.println("passenger plane carries passengers");
	}
	public void fly()
	{
		System.out.println("passenger plane flies at medium height");
	}
}
class b
{
	public void Meth(Aero ref)
	{
		ref.takeOff();
		ref.fly();
		
	}
}
public class A1
{
	public static void main(String[] args) {
		cargo c=new cargo();
		passenger p=new passenger();
		b ref=new b();
		ref.Meth(c);
		ref.Meth(p);
	}
}