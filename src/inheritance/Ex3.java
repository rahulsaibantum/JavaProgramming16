package inheritance;
class Aeroplane
{
	void takeoff()
	{
		System.out.println("Aeroplane is taking off");
	}
	void fly()
	{
		System.out.println("Aeroplane is flying");
	}
}
class CargoPlane extends Aeroplane
{
	void fly()
	{
		System.out.println("Cargoplane flies at lower height");
	}
	void carryGoods()
	{
		System.out.println("Cargoplane carries goods");
	}
}
class PassengerPlane extends Aeroplane
{
	void fly()
	{
		System.out.println("Passengerplane flies at medium height");
	}
	void carryPassengers()
	{
		System.out.println("Passengerplane carries passengers");
	}
}

public class Ex3 
{
	public static void main(String[] args) {
		CargoPlane c=new CargoPlane();
		PassengerPlane p=new PassengerPlane();
		c.takeoff();
		c.fly();
		c.carryGoods();
		p.takeoff();
		p.fly();
		p.carryPassengers();
	}

}
