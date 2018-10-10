import javax.swing.JOptionPane;

public class OnlineBookOrderBrown
{
	//Aleksander Brown
	
	public static void main(String[]args)
	{
		final double taxMultiplier = 0.065;
		final double shippingFee = 2.95;
		double subTotal = 0;
		
	    int numBook = Integer.parseInt(JOptionPane.showInputDialog("Enter number of books: "));
				
		for (int i=0; i < numBook; i++)
		{
			double bookPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter book price of book number " + (i+1)));
			subTotal = subTotal + bookPrice;
		}
		
		
		double tax = subTotal * taxMultiplier;

		double shipping = shippingFee * (double)numBook;
		double orderTotal = subTotal + tax + shipping;
		
		JOptionPane.showMessageDialog(null,"Number of books purchased: " + numBook
				+ "\nBook SubTotal: " + String.format("$%.2f" , subTotal) + 
				"\nTax: " + String.format("$%.2f" , tax) + 
				"\nShipping: " + String.format("$%.2f" , shipping) + 
				"\n________" + 
				"\nOrder Total: " + String.format("$%.2f" , orderTotal));

	}
}