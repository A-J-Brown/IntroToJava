import javax.swing.JOptionPane;

public class BookOrderSentinalBrown
{
	//Aleksander Brown
	
	public static void main(String[]args)
	{
		final double taxMultiplier = 0.065;
		final double shippingFee = 2.95;
		double subTotal = 0;
		int numBook = 0;
		final String sentinal = "done";
		String bookPriceIn = "";
				
		while(!bookPriceIn.equals(sentinal))
		{
			numBook = numBook + 1;
			bookPriceIn = (JOptionPane.showInputDialog("Enter book price of book number " + (numBook) + 
					"\nWhen finished type \'done\'.")).toLowerCase();
			
			if(bookPriceIn.equals("done"))
			{
				numBook = numBook - 1;
			}
			else
			{
				
				double bookPrice = Double.parseDouble(bookPriceIn);
				subTotal = subTotal + bookPrice;
			}

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