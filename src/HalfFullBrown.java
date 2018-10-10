import java.util.Scanner;

public class HalfFullBrown
{
	public static void main(String[]ARGS)
	{
		Scanner in = new Scanner(System.in);
		String glassStatus;
		
		System.out.print("Enter a number between 1 and 100: ");
		int userNumber = in.nextInt();
		

		if (userNumber < 50)
		{
			glassStatus = "The glass is half empty.";
		}
		else
		{
			glassStatus = "The glass is half full.";
		}
		
		System.out.println(glassStatus);
		
		in.close();
	}
}