package daywisepractice;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Customer
{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id,String name,double walletBalance,String address)
	{
		super();
		this.id=id;
		this.name=name;
		this.walletBalance=walletBalance;
		this.address=address;
	}
}
class Item
{
	int id;
	String name;
	String companyName;
	double price;
	boolean inStock;
	public Item(int id,String name,String companyName,double price,boolean inStock)
	{
		super();
		this.id=id;
		this.name=name;
		this.companyName=companyName;
		this.price=price;
		this.inStock=inStock;
	}
}
class ShoppingWebsite
{
	public String purchaseItem(Item i,Customer c) throws ItemOutOfStockException,InsufficientBalanceException
	{
		if(i.inStock==false)
		{
			throw new ItemOutOfStockException("Item is out of stock");
		}
		else if(i.price>c.walletBalance)
		{
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		}
		else
			return "Order Successful";
	}
}
class ItemOutOfStockException extends Exception
{
	public ItemOutOfStockException(String str)
	{
		super(str);
	}
}
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String str)
	{
		super(str);
	}
}

public class Source1 
{
	
	public static void main(String[] args) throws ItemOutOfStockException,InsufficientBalanceException
	{
		Customer cusDet=new Customer(92793,"Steve",5000.0,"USA");
		Item itemDet=new Item(27392,"T-Shirt","US Polo",800,true);
		ShoppingWebsite obj=new ShoppingWebsite();
		String out=obj.purchaseItem(itemDet, cusDet);
		System.out.println(out);
		
	}
}
