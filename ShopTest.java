import java.util.Scanner;

class ShopTest
{

	public static void main(String[] args) 
	{		
		Scanner ina = new Scanner(System.in);

		System.out.print("Enter User Id and Enter Password :-");
		ShopLogin sl = new ShopLogin(ina.nextLine(),ina.nextInt());  //passing user input parameter
		sl.loginShopKeeper();

		MainMenu mm = new MainMenu();
		mm.showMenu();
		

	}
}