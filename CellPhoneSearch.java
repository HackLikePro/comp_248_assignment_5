package test2;
import java.util.Scanner;

class CellPhone{
	
	private String brand;
	private long serial;
	private double price;
	
    public CellPhone()
    {
    	brand = "samsung" ;
    	serial = 1000000;
        price = 100.00;
    }
    
    public CellPhone(String b, long n, double p)
    {
    	brand = b;
    	serial = n;
    	price = p;  	
    }
    
    public CellPhone(CellPhone co)
    {
    	brand = co.brand;
    	serial = co.serial;
    	price = co.price;
    }

	/////////////////////////////////////////// overwrite basic functions ////////////////////////////////////////////////
	// for direct printing objects
	public String toString() 
	{
		return ("Info about this phone: |Brand-"+ brand +"| |serial- "+ serial +"| |price- "+price+"|" );
	}
	
	// for compare objects 
	public boolean equals(CellPhone c)
	{
		if(this.getprice() == c.getprice() && this.getbrand() == c.getbrand())
		return true;
		else
		return false;
	}
	
	
	
	//////////////////////////////////////////////// get information ////////////////////////////////////////////////////
	// get brand 
	public String getbrand()
	{
		return brand;
	}
	
	// get serial number
	public long getserial()
	{
		return serial;
	}
	
	// get price 
	public double getprice()
	{
		return price;
	}
	
	
	////////////////////////////////////////////// change information ///////////////////////////////////////////////////
	// change brand
	public void changebrand(String input) 
	{
	    	
		this.brand = input;	
	}
	// change price
	public void changeprice(double input) 
	{
	    	
		this.price = input;	
	}
	
	// change serial number
	public void changeserial(long input) 
	{
	    	
		this.serial = input;	
	}
    
}


public class CellPhoneSearch {

 
	 public static void main(String []args)
	 {
		  CellPhone [] cellarr = new CellPhone [10];
		 
		  cellarr [0] = new CellPhone ();
		  cellarr [1] = new CellPhone ("nimama",1000001,120.00);
		  cellarr [2] = new CellPhone (cellarr[1]);
		  cellarr [3] = new CellPhone ("nibaba",1000002,130.00);
		  cellarr [4] = new CellPhone (cellarr[3]);
		  cellarr [5] = new CellPhone ("razer",1000003,140.00);
		  cellarr [6] = new CellPhone (cellarr[5]);
		  cellarr [7] = new CellPhone ();
		  cellarr [8] = new CellPhone ();
		  cellarr [9] = new CellPhone ();
   
		  Scanner kb = new Scanner(System.in);
			 
		  System.out.println("////////////////////////// Lets look for cellphones ////////////////////////////");
		  System.out.print("Please input the Brand: ");
		  String bin = kb.next();
		  System.out.print("Please input the Price: ");
		  double pin = kb.nextDouble();
		  System.out.print("Do you want have a combination search? (yes/no) ");
		  String yesno = kb.next();
				 
		  if(yesno == "yes")
		  {
			    int c = 0;
				for (int i = 0; i<cellarr.length;i++)
				{
					if(pin == cellarr[i].getprice() & bin == cellarr[i].getbrand())
					{
						System.out.print("The Phone No."+c+":");
						System.out.println(cellarr[i]);
						c++;
					}
				}
				if(c == 0)
				System.out.println("I didnot find anything in the database");
		  }		  
		  else
		  {
			  int c = 0;
				for (int i = 0; i<cellarr.length;i++)
				{
					if(pin == cellarr[i].getprice() | bin == cellarr[i].getbrand())
					{
						System.out.print("The Phone No."+c+":");
						System.out.println(cellarr[i]);
						c++;
					}
				}
				if(c == 0)
				System.out.println("I didnot find anything in the database");	 
		  }
	
	 }
     
}
