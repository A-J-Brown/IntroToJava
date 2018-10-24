import javax.swing.JOptionPane;

public class BillingBrown
{
	public static void main(String[]args) 
	{
		JOptionPane.showMessageDialog(null,  String.format("$%.2f", computePhotoBill(19.99)) + 
				String.format("%n$%.2f", computePhotoBill(19.99, 2)) + 
				String.format("%n$%.2f", computePhotoBill(19.22, 2, .1))
				);
	}
	
	public static double computePhotoBill(double price)
	{
		final double taxMultiplier = 1.06;
		return price * taxMultiplier;
	}
	
	public static double computePhotoBill(double price, int qty)
	{
		final double taxMultiplier = 1.06;
		return (price * qty) * taxMultiplier;
	}
	
	public static double computePhotoBill(double price, int qty, double discount)
	{
		final double taxMultiplier = 1.06;
		double subtotal = price * qty;
		double discAmt = subtotal * discount;
		return (subtotal - discAmt) * taxMultiplier;
	}
}



/*
Method Overloading Billing
Create a new Java file called BillingYourLastName with a public static void main.

Create three overloaded computePhotoBill() methods for Shutterfly.

When computePhotoBill() receives a single double parameter, it represents the price of one photo book ordered.  Add 6% tax and return the total due as a double.

When computePhotoBill() received two parameters, they represent the price of a photo book and the quantity ordered (int).  Multiply the two values, add 6% tax and return the total due.

Finally, when computePhotoBill() receives three parameters, they represents the price of a photo book, the quantity ordered, and a coupon value.  Multiple the quantity and price, reduce the result by the coupon value and then add 6% tax and return the total due.

In the main method, call each method testing to make sure you receive the correct values and back.  For example, with these calls (using printf to two decimals), I would receive the following:


computePhotoBill(19.99);   // 21.19

computePhotoBill(19.99, 2);   // 42.38

computePhotoBill (19.22, 2, .1);   // 36.67


Submit your BillingYourLastName to this assignment when you are finished.  Your submission is worth 15 points.
*/