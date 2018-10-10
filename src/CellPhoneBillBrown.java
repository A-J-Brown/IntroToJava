import java.util.Scanner;

public class CellPhoneBillBrown
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		final double base = 12;
		final int tier1 = 100;
		final int tier2 = 200;
		final double tax = .12;
		double bill = 0;
		double totalBill = 0;
		String phoneNumber = "";
		int messages = 0;
		boolean exit = false;
		
		while(!exit)
		{
			System.out.print("Enter Phone number with area code: ");
			phoneNumber = in.next();
			System.out.print("Enter number of messages sent: ");
			messages = in.nextInt();
			
			
			System.out.println(phoneNumber);
			System.out.printf("$%.2f", bill);
			System.out.printf("\n$%.2f", totalBill);
			
			String exitPrompt = "";
			System.out.print("Would you like to enter another phone number? ");
			exitPrompt = in.next().toLowerCase();
			if(exitPrompt.equals("no"))
			{
				exit = true;
			}
		}
		
		in.close();
	}
}