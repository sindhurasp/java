package Exp;

class Meeshoexception extends Exception{
	String msg;
	Meeshoexception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Meesho
{
	static void price()throws Meeshoexception{
		int amt=400;
		if(amt>=500)
		{
			System.out.println("get discount");
		}
		else
		{
			throw new Meeshoexception("no discount");
		}
	}
	public static void main(String[] args) {
		try{
			price();
		}
		catch(Meeshoexception e)
		{
			System.out.println(e. getmessage());
		}
	}
}


