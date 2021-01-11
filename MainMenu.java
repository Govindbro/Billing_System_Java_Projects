class MainMenu extends Billing   // mainmenu is child class of Billing
{
	public void showMenu()    // for menu options details
	{
		System.out.println("_____________________________________________________________________________________________");
		System.out.print("| This is Mainmenu || ");
		System.out.print("Enter 1 for Billing  | ");
		System.out.print("Enter 2 for Product List  | ");
		System.out.println("Enter 3 for Log out | ");
		System.out.println("_____________________________________________________________________________________________");
		System.out.print("Enter Reliable Number :- ");
		choseMenu();
	}
	

	public void choseMenu()     // methoid for chossing your option
	{
		int n=ins.nextInt();    //taking input
		if(n==1)
		{
			System.out.println("Welcome for Billing ");
			System.out.println("Bill No = 1");
			preDetails();
			bill();
			int i = 0;
			while(i<5) 
			{
				System.out.print("Enter 'true' for continue Billing and 'false' for Return to Mainmenu =");
				boolean boo = ins.nextBoolean();
				if(boo==true)
				{
					System.out.println("Bill No =" + (i+2));
					preDetails();
					bill();
					i++;
				}
				else
				{
					showMenu();
				}				
			}
		}
		else if(n==2)
		{
			System.out.println("View Product List ");
			printIt();
			showMenu();
		}
		else if(n==3)
		{
			System.out.println("Logging Out..................;) ");
			System.exit(0);
		}
		else
		{
			System.out.println("Wrong Input. Please Enter Correct Choice");
			showMenu();
		}
		
	}
}