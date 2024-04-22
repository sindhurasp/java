package Exp;

class Flipkartexception extends Exception{
	String msg;
	Flipkartexception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Flipkart 
{
	static void price()throws Flipkartexception{
		int amt=400;
		if(amt>=500)
		{
			System.out.println("its good");
		}
		else
		{
			throw new Flipkartexception("No discount");
		}
	}
	public static void main(String[] args) {
		try{
			price();
		}
		catch(Flipkartexception e)
		{
			System.out.println(e. getmessage());
		}
	}
}
