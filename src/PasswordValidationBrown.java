import javax.swing.JOptionPane;

public class PasswordValidationBrown
{
	public static void main(String[]args)
	{
		String password1 = JOptionPane.showInputDialog("Enter a password: ");
		String password2 = JOptionPane.showInputDialog("Confirm Password: ");
		
		boolean match = validatePassword(password1, password2);
	}
	public static boolean validatePassword(String str1, String str2)
	{
		
		
		return match;
	}
}