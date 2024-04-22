package Exp;

class Atmcardexception extends Exception{
	String msg;
	Atmcardexception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Atmcard 
{
	static void price()throws Atmcardexception{
		int amt=4;
		if(amt>=5)
		{
			System.out.println("its good");
		}
		else
		{
			throw new Atmcardexception("penalty");
		}
	}
	public static void main(String[] args) {
		try{
			price();
		}
		catch(Atmcardexception e)
		{
			System.out.println(e. getmessage());
		}
	}
}

