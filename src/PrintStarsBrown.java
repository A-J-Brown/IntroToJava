import javax.swing.JOptionPane;

public class PrintStarsBrown
{
	//Aleksander Brown
	public static void main(String[]args)
	{
		String stars = "";
		int counter = 0;
		int lines = 0;
		
		lines = Integer.parseInt(JOptionPane.showInputDialog("How many lines of stars would you like to print?"));
		
		do
		{
			stars = stars + "\n**********";
			counter++;
		}
		while(counter <= lines);
		
		JOptionPane.showMessageDialog(null, stars);
	}
}