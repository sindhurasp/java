package Exp;

class Pincodeexception extends Exception{
	String msg;
	Pincodeexception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Pincode
{
	static void price()throws Pincodeexception{
		int amt=5;
		if(amt>=6)
		{
			System.out.println("get discount");
		}
		else
		{
			throw new Pincodeexception("not valid");
		}
	}
	public static void main(String[] args) {
		try{
			price();
		}
		catch(Pincodeexception e)
		{
			System.out.println(e. getmessage());
		}
	}
}



