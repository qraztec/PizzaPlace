/*
 * Name: Gerum Haile-Lincoln
 * Project: Pizza Place
 * Objective: Create an interactive menu to either pick out a specialty pizza or make your own pizza.
 * After that, the code will print out a receipt with the price and items chosen.
 * 
 * Main User program
 * MenuItems class for specialty
 * Another class for MYO pizza
 * Another class for receipt
 */






import java.util.Scanner;

public class User {

	
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scnr = new Scanner(System.in);
		// String [][] menuItems = {{"Pepperoni Deluxe","17.00"}, {"Veggie","15.00"},{"Margherita","16.00"},{"Mac & Cheese","16.00"}, {"Four Cheese","15.00"}};
     	MenuItems special = new MenuItems();
     	MYO special2 = new MYO();
     	
     	String totalOrder = "";
     	Double totalPrice = 0.00;
     	String storeName = "Gerum's Pizza";
     	String cashierName = "Gerum Haile-Lincoln";
     	String greeting = "Thank you for dining with us!";
     	double taxRate = 0.05;
     	String paymentType = "Cash";
     	String concat = "";
     	//Receipt rec = new Receipt();
		System.out.println("Hello and Welcome to Gerum's Pizza! \nPick the number of what you plan to order 1. [Specialty Pizza"
				+ "] or 2. [Make Your Own Pizza]\nIf you want to leave this menu at anytime, please type 3");
		
	 //   special.Order();
		
		String choice = scnr.next();
		
		while (!choice.isEmpty())
		{
		if (choice.equals("1"))
		{
			special.Order();
			special.setOrder(scnr.next());
			totalOrder += special.getOrder() + "Pizza\n";
			totalPrice += special.getOrderPrice();
			System.out.println("Thank you for ordering with us!\n\nType 1 or 2 if you want another specialty pizza or to make your own pizza"
					+ ", or type 3 to leave");
			choice = scnr.next();
		}
		else if (choice.equals("2"))
		{
			special2.Order();
			totalOrder += special2.getOrder() + " Pizza\n";
			totalPrice += special2.getOrderPrice();
			//rec.printRec();
			System.out.println("Thank you for ordering with us!\n\nType 1 or 2 if you want another specialty pizza or to make your own pizza"
					+ ", or type 3 to leave");
			choice = scnr.next();
		}
		else if (choice.equals("3"))
		{
			break;
		}
		else
		{
			System.out.println("We couldn't recognize the number. Please try again.");
			choice = scnr.next();
		}
		}
		
	//	totalOrd = totalOrder.toString();
		
		
		
		Receipt r = new Receipt(totalOrder, totalPrice, storeName, cashierName, greeting, taxRate, paymentType);
		//System.out.print(r.)
		
		
	    
		
			
			
		

	}
	
	

}
