public class Receipt
{

	private String totalOrder;
	private double totalPrice;
	private String storeName;
	private String cashierName;
	private String greeting;
	private double taxRate;
	private String paymentType;
	
	//constructor
	public Receipt(String totalOrder, double totalPrice, String storeName, String cashierName, String greeting, double taxRate,
			String paymentType) {
		
		this.totalOrder = totalOrder;//.substring(1);
		this.totalPrice = (double)Math.round(totalPrice * 100d) / 100d;;
		this.storeName = storeName;
		this.cashierName = cashierName;
		this.greeting = greeting;
		this.taxRate = taxRate;
		this.paymentType = paymentType;
		System.out.println(toString());
	}
	
	

	public double calculateSubTotal(double totalPrice) {
		
		
		double result = totalPrice * taxRate;
		result = (double)Math.round(result * 100d) / 100d;
		return result;
	}

	public String toString() {
		StringBuffer receiptOutput = new StringBuffer();
		
		receiptOutput.append(storeName + "\n");
		receiptOutput.append(cashierName + "\n");
		receiptOutput.append(greeting + "\n");
		receiptOutput.append(totalOrder);
		receiptOutput.append("Subtotal\t$" + totalPrice + "\n");
		receiptOutput.append("Tax\t\t$" + (calculateSubTotal(totalPrice)) + "\n");
		receiptOutput.append("Total\t\t$" + (totalPrice + (calculateSubTotal(totalPrice)) + "\n"));
		receiptOutput.append("Payment Type\t" + paymentType + "\n");
	    
	
		
	
		
		return receiptOutput.toString();
	}
}