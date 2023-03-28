package polymorphism;
class Aeroplane
{
	public void takeOff()
	{
		System.out.println("Aeroplane runway");
	}
	public void fly()
	{
		System.out.println("Aerplane height");
	}
}
class CargoPlane extends Aeroplane
{
	public void takeOff()
	{
		System.out.println("Cargoplane requires longer runway");
	}
	public void fly()
	{
		System.out.println("Cargoplane flies at lower height");
		System.out.println("---------------------------------");
	}

}
class FighterPlane extends Aeroplane
{
	public void takeOff()
	{
		System.out.println("Fighterplane requires shorter runway");
	}
	public void fly()
	{
		System.out.println("Fighterplane flies at shorter height");
		System.out.println("---------------------------------");
	}
}
class PassengerPlane extends Aeroplane
{
	public void takeOff()
	{
		System.out.println("Passengerplane requires medium runway");
	}
	public void fly()
	{
		System.out.println("Fighterplane flies at medium height");
		System.out.println("---------------------------------");
	}
}
class Airport 
{
	public void poly(Aeroplane a)
	{
		a.takeOff();
		a.fly();
	}
}
public class P1
{
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		PassengerPlane pp=new PassengerPlane();
		Airport ref=new Airport();
		ref.poly(cp);
		ref.poly(fp);
		ref.poly(pp);
		
		
	}
}