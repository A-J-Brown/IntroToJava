/*Create a Java file called CompoundInterestYourLastName.  Write a method called computeBalance( ) that computes the balance of a bank account with a given initial balance and interest rate, after a given number of years. Assume interest is compounded yearly.

You can use the standard calculator here to check your results (note that you'll have to change the dropdown to compound the interest yearly):  http://www.thecalculatorsite.com/finance/calculators/compoundinterestcalculator.php

Use a loop to control the iterations through the years in your method.

Your method should return a double value.

In your main method, run the following tests to verify your method is working correctly.


System.out.printf("Your total is $%.2f", computeBalance(1000, .045, 3));

// should return $1141.17

System.out.printf("\nYour total is $%.2f", computeBalance(2000, .03, 5));

// should return $2318.55

System.out.printf("\nYour total is $%.2f", computeBalance(3000, .01, 10));

// should return $3313.87

Pay close attention to your parameters to make sure they match the test datat!

*Note:  Your methods should have this exact signature line, including the correct spelling, capitalization and parameter types.  Otherwise, when I run the test to check the file, your methods will fail and you'll have to revise.

When you are finished with your file, upload it to Blackboard.  This program is worth 10 points.
*/

import javax.swing.JOptionPane;

public class CompoundInterestBrown
{
	//Aleksander Brown
	public static void main(String[]args)
	{
		/*
		double amt = Double.parseDouble(JOptionPane.showInputDialog("Enter amount: "));
		double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter rate as decimal: "));
		double years = Double.parseDouble(JOptionPane.showInputDialog("Enter number of years: "));
		*/
		JOptionPane.showMessageDialog(null, "Your total is " + String.format("$%.2f", computeBalance(1000, .045, 3))
			+ "\nYour total is " + String.format("$%.2f", computeBalance(2000, .03, 5))
			+ "\nYour total is " + String.format("$%.2f", computeBalance(3000, .01, 10))
			);
	}
	
	public static double computeBalance(double amt, double rate, double years)
	{
		
		while (years >0)
		{
			years --;
			amt = amt + (amt * rate);
		}
		
		return amt;
	}
}
