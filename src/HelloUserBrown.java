import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloUserBrown
{
	//Aleksander Brown
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String name = "";
		String titleCaseName = "";
		String output = "";
		int age = 0 ;
		
		//request name
		name = JOptionPane.showInputDialog("Enter your first name");
		//change name to title case
		titleCaseName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		//request age then add 1
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		age++;
		//store output as variable
		 output = "Howdy, " + titleCaseName + ". Next year you will be " + age + " years old.";
		//output finished message
		JOptionPane.showMessageDialog(null, output);
		
		in.close();
	}
}