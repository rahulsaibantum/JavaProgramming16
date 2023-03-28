package interface1;
interface Car
{
	   void seats();
	   void gear();
	   void mielage();
}
@FunctionalInterface
interface car1
{
	void car123();
}
class hyndai implements Car
{
	 public void seats()
	{
		System.out.println("4 seater hyundai");
	}
	 public void gear()
	{
		System.out.println("automatic+manual");
	}
	 public  void mielage()
	{
		System.out.println("100km");
	}
}
class volvo implements Car
{
	public void seats()
	{
		System.out.println("6 seater hyundai");
	}
	public void gear()
	{
		System.out.println("automatic");
	}
	public void mielage()
	{
		System.out.println("200km");
	}
}
class demo
{
	public void showDetails(Car obj)
	{
		obj.seats();
		obj.gear();
		obj.mielage();
	}
}
public class In2
{
	public static void main(String[] args) {
		hyndai h=new hyndai();
		volvo v=new volvo();
		demo d=new demo();
		d.showDetails(h);
		d.showDetails(v);
	}
}





























