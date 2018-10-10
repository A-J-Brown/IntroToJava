import java.util.Scanner;

public class BarCountBrown
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		final int max = 125;
		int current = 0;
		boolean full = false;
		
		while(full == false)
		{
			System.out.println("There are " + current + " people in the bar");;
			System.out.print("Enter a positive number for people entering or a negative number for people leaving: ");
			int change = in.nextInt();
			int newCurrent = current + change;
			if(0<= newCurrent && newCurrent <= max)
			{
				current = newCurrent;
				if(current == max)
				{
					full = true;
				}
			}
		}
		System.out.println("Bar is full");
		
		in.close();
	}
}