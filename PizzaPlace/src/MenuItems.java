
public class MenuItems {
	private String[][] menuItems = {{"1. Pepperoni Deluxe","17.00"}, {"2. Veggie","15.00"},{"3. Margherita","16.00"},{"4. Mac & Cheese","16.00"}, {"5. Four Cheese","15.00"}};
	private String specialOrder;
	private String specialPrice;
	
	
	
	public void Order()
	{
		System.out.println("Pick your number from below");
		for (int i = 0; i < menuItems.length; i++) {
			System.out.print(menuItems[i][0] + "    $" + menuItems[i][1] + "\n");
		}
		//return "Hello";
	}
	
	public void setOrder(String order)
	{
		int num = Integer.parseInt(order);
		this.specialOrder = menuItems[num][0];
		this.specialPrice = menuItems[num][1];
	}
	
	
	public double getOrderPrice()
	{
		double specialConvert = Double.parseDouble(specialPrice);
		return specialConvert;
	}
	
	public String getOrder()
	{
		this.specialOrder = specialOrder.substring(3, specialOrder.length()) + " ";
		return specialOrder;
	}
}
