import javax.swing.JOptionPane;

public class PasswordValidationBrown
{
	public static void main(String[]args)
	{
		boolean match = false;
		
		while(match == false)
		{
			String password1 = JOptionPane.showInputDialog("Enter a password: ");
			String password2 = JOptionPane.showInputDialog("Confirm Password: ");
			match = validatePassword(password1, password2);
		}

		System.out.print(match);
	}

	public static boolean validatePassword(String str1, String str2)
	{
		
		boolean pass = false;
		boolean length = false;
		boolean cap = false;
		boolean lower = false;
		boolean num = false;
		
		//test length
		if(str1.length() >= 8)
		{
			length = true;			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Password must be 8 characters or longer.");
			return false;
		}
		
		//test upper case
		for(int i = 0; i < str1.length(); i++)
		{
			char sub = str1.charAt(i);
			
			if(Character.isUpperCase(sub))
			{
				cap = true;
				break;
			}
			//else 
			//{
			//	JOptionPane.showMessageDialog(null, "Password must have an upper case character.");
			//	return false;
			//}
		}
		
		//test lower case
		for(int i=0; i < str1.length(); i++)
		{
			char sub = str1.charAt(i);
			
			if(Character.isLowerCase(sub))
			{
				lower = true;
				break;
			}
			else JOptionPane.showMessageDialog(null,"Password must have a lower case character.");
			return false;
		}

		return pass;
	}
}

/*
Password Validation
Write a program called PasswordValidationYourLastName that validates a new password, following these guidelines:

Must be at least 8 characters
Must have at least 1 uppercase letter
Must have at least 1 lowercase letter
Must have at least 1 digit
Write a program that asks for a password, and then asks again to confirm it (you can use the scanner or JOptionPane).  Pass those two Strings to a method called validatePassword( ).  Your validatePassword( ) should return a boolean - true if the passwords pass validation and false if the passwords do not pass validation.

If the passwords don’t meet validation rules, prompt again.  If the passwords meet validation rules, return “Password changed” and exit the program.

Your validatePassword( ) method will check to see if the two passwords passed in are valid.  All of the checks should happen in the method.

Right off the bat in your method, you should automatically return false if the passwords are not the same.

Again, if they are less than 8, then you can immediately return false too.

If the passwords are the same, then begin your checks listed above.  You could use booleans variables as flags to keep track whether you've found an uppercase, lowercase and digit.

You can use isUpperCase(), isLowerCase(), isDigit() to check to see if something is a digit, uppercase or lowercase in the String.

After looking at the string, if all of your boolean variables are true (meaning you've found them), then you know your passwords are good.

Is there a reason to compare both passwords if they are the same?  No.  So just run your checks through one variable.

Again: use a boolean as your return type in the method.  If any of the components are not met, change the boolean to false.  Once the boolean is set to false, you know the password was not valid and you can return that to your main method as false for the re-prompting to happen again (probably in a loop of some kind).

Upload your .java file to Blackboard.  This file is worth 15 points.
*/