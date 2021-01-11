class ProductList 
{	
	
	int[] productId = {0,1,2,3,4};       //using array 
	String[] productName = {"Cream","Sugar","Dal","Wheet","Rice"};
	int[] productPrice = {145,645,765,342,435};
	
	public void printIt()  //printing ProductList
	{
		System.out.println("_______________________________________");
		System.out.println("| ProductId"+" | "+"Name"+"      | "+"Price |");
		for (int i = 0; i < productId.length; i++)
			{
  				System.out.println("| "+i+"         | "+productName[i]+"      | " +productPrice[i]+ " |");
  				System.out.println("_______________________________________");
			}
	}

}
