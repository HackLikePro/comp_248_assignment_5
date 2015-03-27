
class CellPhone{
	
	private String brand;
	private long serial;
	private double price;
	
    public CellPhone()
    {
    	double random = Math.random()*10;
	    if(6 < random & random < 10)
	    {
	    	brand = "samsung";
	    	serial = 1000000;
	        price = 100.00;
	    }
	    if(3 < random & random < 6)
	    {
	    	brand = "apple";
	    	serial = 1000001;
	        price = 200.00;
	    }
	    if(0 < random & random < 3)
	    {
	    	brand = "oneplus 1";
	    	serial = 1000002;
	        price = 400.00;
	    }
	    
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

public class ModifyCellPhones {

	public static int ModifyPhonePrices(CellPhone [][]c, double j, double k)
	{
		int count = 0;
		for(int i = 0; i< c.length ; i++)
		{
		    for (int i2 = 0; i2<c[i].length;i2++)
		    {
		    	if(c[i][i2].getprice()==j)
		    	{
		    		c[i][i2].changeprice(k);
		    		count++;
		    		System.out.println("A change of phone has taken place at index:"+" ["+i+"] "+" ["+i2+"] ");
		    	}
		    }
		}
		
		return count;
	}
	
	public static void main(String []args)
	{
		
		CellPhone [][] cellarr = new CellPhone [10][10]; 
		
		
		for (int i = 0; i<10; i++)
		{
			for (int i2 = 0 ; i2<10; i2++)
			{
			    double random = Math.random()*10;
			    if(6 < random & random < 10)
			    {
			    	cellarr[i][i2] = new CellPhone();
			    }
			    if(3 < random & random < 6)
			    {
			    	cellarr[i][i2] = new CellPhone();
			    }
			    if(0 < random & random < 3)
			    {
			    	cellarr[i][i2] = new CellPhone("LOL",1234567,0.01);
			    }
			}
		}
		
		for (int i = 0; i<10; i++)
		{
			for (int i2 = 0 ; i2<10; i2++)
			{
				 cellarr[i][i2].changeprice(Math.random() *  200 + 100);
			}
		}
		
		for (int i = 0; i<10; i++)
		{
			for (int i2 = 0 ; i2<10; i2++)
			{
				System.out.printf("%10.2f",cellarr[i][i2].getprice());
			}
			System.out.print("\n");
		}
		
		ModifyPhonePrices(cellarr,211.00,0.00);
		ModifyPhonePrices(cellarr,100.00,0.00);
	}
	
}
