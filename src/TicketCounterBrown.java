import java.util.Scanner;
import javax.swing.JOptionPane;

public class TicketCounterBrown
{
	//Aleksander Brown
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		int ticketsAvailable = 75;
		int numOfBuyers = 0;
		
		
		while(ticketsAvailable > 0)
		{
			String ticketsRequested;
			int ticketsRequestedInt;
			
			ticketsRequested = JOptionPane.showInputDialog(
					"There are " + ticketsAvailable + " tickets available." + 
					"\nYou may order between 1 and 6 tickets." +
					"\nHow many tickets would you like? ");
			ticketsRequestedInt = Integer.parseInt(ticketsRequested);
		if(ticketsRequestedInt <= ticketsAvailable)
		{
			if(ticketsRequestedInt <= 6 && ticketsRequestedInt >=1)
			{
				ticketsAvailable = ticketsAvailable - ticketsRequestedInt;
				numOfBuyers++;
			}
			else
			{
				JOptionPane.showMessageDialog(null,  "Ticket quantity must be between 1 and 6.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Not enough tickets remain.");
		}
			
			
		}
		
		JOptionPane.showMessageDialog(null, numOfBuyers + " people purchased tickets.");
		
		in.close();
	}
}