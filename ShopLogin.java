import java.util.Scanner;

class ShopLogin 
{


	private String id ;
	private int password ;
	
	public ShopLogin(String id , int password) //Constructer argument
	{
		setId(id);
		setPassword(password);
	}
	public void setId(String id)  //setter id
	{
		this.id = id ;
	}
	public void setPassword(int password)   //setter Password
	{
		if(password>10000 && password<99999)
		{
		this.password=password;
		}
		else
		{
			System.out.println("Password can be only of 5 Numbes");
			System.out.println("Wrong Attempt");
			System.exit(0);
		}
	}
	public String getId()  //getter id
	{
		return id;
	}
	public int getPassword()  //getter password
	{
		return password ;
	}


	public void loginShopKeeper()  //method for Loging into program
	{
	
		if(getId().equals("kelger") && getPassword()==12345 )
		{
			System.out.println("Successfully Login !!!");			
		}
		else
		{
			System.out.println("Wrong Password or ID ");
			System.exit(0);
		}
	}

}
	
