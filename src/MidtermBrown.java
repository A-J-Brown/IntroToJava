//Aleksander Brown

import java.util.Scanner;

public class MidtermBrown
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		String first = "";
		String last = "";
		double sales = 0;
		double bonus = 0;
		final double bonusPercentStar = .03;
		final double bonusPercentNoStar = .02;
		String stars = "";
		final String tier1Stars = "";
		final String tier2Stars = "**";
		final String tier3Stars = "****";
		final String sentinal = "zzz";
		boolean exit = false;
		
		//first and one time prompt
		System.out.println("First Name: ");
		first = in.next().toLowerCase();
		
		while(!exit)
		{
			System.out.print("LastName: ");
			last = in.next().toLowerCase();
			System.out.print("Enter total sales: ");
			sales = in.nextDouble();
			System.out.print("Press y for all-star, n for non-all-star: ");
			String allStar = in.next().toLowerCase();
			if(allStar.equals("y"))
			{
				bonus = sales * bonusPercentStar;
			}
			else
			{
				bonus = sales * bonusPercentNoStar;
			}	
			if(bonus > 100)
			{
				stars = tier3Stars;
			}
			else if(bonus >50)
			{
				stars = tier2Stars;
			}
			else
			{
				stars = tier1Stars;
			}
			//format and print outputs
			first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
			last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
			System.out.printf(last + ", " + first + " " + stars + " - $%.2f", bonus);
			System.out.println();			
			//prompt for next name or sentinal
			System.out.print("Please enter another name or ZZZ to exit: ");
			first = in.next().toLowerCase();
			if(first.equals(sentinal))
			{
				exit = true;
			}
			else
			{
				exit = false;
			}
			
		}
		in.close();
	}
}