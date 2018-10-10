import java.util.Scanner;

public class ifStatementTest
{
	public static void main(String[]ARGS)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		int n = in.nextInt();
		
		if (n > 10)
		{
			System.out.print("*****");
		}
		if (n > 7)
		{
			System.out.print("****");
		}
		if (n > 4)
		{
			System.out.print("***");
		}
		if (n > 1)
		{
			System.out.print("**");
		}
		
		System.out.println("*");

		in.close();
	}
}