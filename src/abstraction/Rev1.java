package abstraction;
class Emp
{
	private Address Addr;
	public void setAddr(Address Addr)
	{
		this.Addr=Addr;
	}
	public void show()
	{
		Addr.getAddress();
	}
}
class Address
{
	public void getAddress()
	{
		System.out.println("Vijayawada");
	}
}
class Rev1
{
	public static void main(String[] args) {
	Address obj=new Address();
	Emp obj1=new Emp();
	obj1.setAddr(obj);
	obj1.show();
	}
	
}