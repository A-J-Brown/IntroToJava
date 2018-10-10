import java.util.Scanner;

public class BookOrdersBrown
{
	//Aleksander Brown
	

	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of books: ");
		int numBook = in.nextInt();
		System.out.print("Enter Subtotal: ");
		double subTotal = in.nextDouble();
		final double taxMultiplier = 0.065;
		double tax = subTotal * taxMultiplier;
		final double shippingFee = 2.95;
		double shipping = shippingFee * (double)numBook;
		double orderTotal = subTotal + tax + shipping;
		
		System.out.println("Number of books purchased: " + numBook);
		System.out.println("Book SubTotal: " + subTotal);
		System.out.println("Tax: " + tax);
		System.out.println("Shipping: " + shipping);
		System.out.println("");
		System.out.printf("Order Total: $%.2f" , orderTotal);
		
		in.close();
	}
}
