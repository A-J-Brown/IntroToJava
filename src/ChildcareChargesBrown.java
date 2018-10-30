import javax.swing.JOptionPane;

public class ChildcareChargesBrown
{
	//Aleksander Brown
	public static void main(String[]args)
	{
		int rates[][] = {      {30, 60, 88, 115, 140},
                {26, 52, 70, 96, 120},                 
                {24, 46, 67, 89, 110},
                {22, 40, 60, 75, 88},
                {20, 35, 50, 66, 84} };
		//row
		int age = 0;
		//col
		int days = 0;
		while(age != 999) {
			age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age 0-4 or enter 999 to stop: "));
			
			if(age == 999) {
				break;
			}
			
			if(age > 4 || age < 0) {
				JOptionPane.showMessageDialog(null, "Age must be between 0 and 4");
				continue;
			}
			
			days = Integer.parseInt(JOptionPane.showInputDialog("Enter number of days per week: "));
			
			if(days > 5 || days < 1) {
				JOptionPane.showMessageDialog(null, "Days per week must be between 1 and 5: ");
				continue;
			}
			
			JOptionPane.showMessageDialog(null, "Cost of 1 week: $" + rates[age][days-1]);
				
		}
		
		
	}
}