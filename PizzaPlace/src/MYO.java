import java.util.Scanner;

/*
 * Make your own pizza class
 */

public class MYO {
	

	String crustNums;
	String sauceNums;
	String cheeseNums;
	String[] toppingsNums = new String[5];
	double price;
	String concat;

	Scanner scnr = new Scanner(System.in);
	private String[] crust = { "1. Hand-Tossed", "2. Deep-Dish", "3. Thin", "4. Stuffed" };
	private String[] sauce = { "1. Tomato", "2. White", "3. BBQ", "4. Oregano" };
	private String[] cheese = { "1. Mozzarella", "2. Parmesan", "3. Cheddar", "4. Feta" };
	private String[] toppings = { "1. Pepperoni", "2. Bacon", "3. Chicken", "4. Ham", "5. Turkey", "6. Beef",
			"7. Jalapeno", "8. Mushrooms", "9. Peppers", "10. Pineapple", "11. Olives" };

	public void Order() {
		setCrust();
		setSauce();
		setCheese();
		setToppings();
		getOrder();
	}

	public void setCrust() {
		System.out.println("Pick your crust from below");
		for (int i = 0; i < crust.length; i++) {
			System.out.print(crust[i] + "\n");
		}
		String j = scnr.next();
		int i = Integer.parseInt(j);
		this.crustNums = crust[i - 1];

	}

	public void setSauce() {
		System.out.println("Pick your sauce from below");
		for (int i = 0; i < sauce.length; i++) {
			System.out.print(sauce[i] + "\n");
		}
		String j = scnr.next();
		int i = Integer.parseInt(j);
		this.sauceNums = sauce[i - 1];
	}

	public void setCheese() {
		System.out.println("Pick your cheese from below");
		for (int i = 0; i < cheese.length; i++) {
			System.out.print(cheese[i] + "\n");
		}
		String j = scnr.next();
		int i = Integer.parseInt(j);
		this.cheeseNums = cheese[i - 1];
	}

	public void setToppings() {
		System.out.println("Pick your toppings from below. You may choose up to 5 toppings.\nType 3 when done.");

		for (int i = 0; i < toppings.length; i++) {
			System.out.print(toppings[i] + "\n");

		}

		/*
		 * System.out.println("Pick up to 5 toppings. Type 3/ to break."); String j =
		 * scnr.next(); while (!j.isEmpty()) { int k = Integer.parseInt(j);
		 * this.toppingsNums[i] = toppings[k - 1];
		 * 
		 * }
		 */
		for (int i = 0; i < 5; i++) {

			String j = scnr.next();
			if (j.equals("3/")) {
				break;
			} else {
				int k = Integer.parseInt(j);
				this.toppingsNums[i] = toppings[k - 1];
			}

		}

	}

	public double getOrderPrice() {
		return 18.00;
	}

	public String getOrder()
	
	{
		StringBuffer order = new StringBuffer();
		this.crustNums = this.crustNums.substring(1, crustNums.length());
		this.sauceNums = this.sauceNums.substring(1, sauceNums.length());
		this.cheeseNums = this.cheeseNums.substring(1, cheeseNums.length());
		order.append(crustNums + " ");
		order.append(sauceNums + " ");
		order.append(cheeseNums + " ");
		
		/*
		 * System.out.print(crustNums + " "); System.out.print(sauceNums + " ");
		 * System.out.print(cheeseNums);
		 * 
		 
		  for (int i = 0; i < this.toppingsNums.length; i++) { if
		  (toppingsNums[i]!=null) { this.toppingsNums[i] =
		  this.toppingsNums[i].substring(3, toppingsNums[i].length());
		  System.out.print(this.toppingsNums[i]); }
		 
		 * 
		 * } System.out.println();
		 */
	//	this.concat = crustNums + " " + sauceNums + " " + cheeseNums + " ";
		  for (int i = 0; i < this.toppingsNums.length; i++) 
		  { 
			  if (toppingsNums[i]!=null) 
		  { 
			  this.toppingsNums[i] = this.toppingsNums[i].substring(1, toppingsNums[i].length());
			  order.append(this.toppingsNums[i] + " "); 
		  }
		  
		  
		  }
		//  System.out.print(concat);
		  return order.toString();
		  
	      
	
	
}
	
	
	
}
