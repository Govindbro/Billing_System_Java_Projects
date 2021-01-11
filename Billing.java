import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  


class Billing extends ProductList
{
	
	double sum=0;
	double gST = 5.50;
	long customerContNo ;
	int customerPay ;


	Scanner ins = new Scanner(System.in);    //for taking user input at Run time
	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //for taking date and time from system
	Date date = new Date(); 
	

	public void preDetails() //it stores pre bill details
	{

		System.out.println("___________________________________________");	
		System.out.println(fmt.format(date)); 
		System.out.println("Welcome to SHUATS Retail Shop. ");
		System.out.println("Address - Maheva , Naini , Allahabad");
		System.out.println("GIST Number - XXXXXXXXXXXXXXX");
		System.out.print("Customer Phone No -");
		customerContNo = ins.nextLong(); 		
		System.out.println("___________________________________________");	
	}

	public void bill()  // this method use to calculate bill
	{	
		System.out.println("___________________________________________");		
		System.out.println("| No   | "+"Product Name   | "+"Price Per Unit  | ");
		
		for (int i = 0; i < productId.length; i++)
		{
			System.out.println("| "+(i+1)+"   | "+productName[i]+"  |  "+productPrice[i]+"  |  ");
			System.out.print("Quantity = ");
			int quantity = ins.nextInt();
			System.out.println("Total Amount = "+(productPrice[i]*quantity));
  			sum = (productPrice[i]*quantity*gST) + sum ;     //sum of price with GST 
		}

		System.out.println("Grand Total Amount with GST = "+sum +"Rs");
		System.out.print("Customer Give Rs =  ");
		customerPay = ins.nextInt();
		System.out.print("Return Change = "+(customerPay-sum));
		System.out.println("Thanks Come Again :) ");
		System.out.println("___________________________________________");
			
	}
	

	
}