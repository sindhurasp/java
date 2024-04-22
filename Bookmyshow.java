package Exp;

class Bookmyshowexception extends Exception{
	String msg;
	Bookmyshowexception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Bookmyshow
{
	static void price()throws Bookmyshowexception{
		int amt=2;
		if(amt>=3)
		{
			System.out.println("get discount");
		}
		else
		{
			throw new Bookmyshowexception("not possible");
		}
	}
	public static void main(String[] args) {
		try{
			price();
		}
		catch(Bookmyshowexception e)
		{
			System.out.println(e. getmessage());
		}
	}
}




