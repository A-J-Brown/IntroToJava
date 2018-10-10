import java.util.Scanner;

public class EFScaleBrown
{	
	//Aleksander Brown
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		int gust = 0;
		//range ints, all ranges entered as >=
		
		int ef1RangeBottom = 86;
		int ef2RangeBottom = 111;
		int ef3RangeBottom = 136;
		int ef4RangeBottom = 166;
		int ef5RangeBottom = 201;
		int efRating = 0;
		
		//catch exception for entering non int
		try 
		{
			System.out.print("Please enter wind speed sustained over 3 seconds: ");
			gust = in.nextInt();

		}
		catch(java.util.InputMismatchException exception)
		{
		}
		//test for minimum entry
		if (gust > 64 )
		{
			if(gust >= ef5RangeBottom)
			{
				efRating = 5;
			}
			else if (gust >= ef4RangeBottom)
			{
				efRating = 4;
			}
			else if (gust >= ef3RangeBottom)
			{
				efRating = 3;
			}
			else if (gust >= ef2RangeBottom)
			{
				efRating = 2;
			}
			else if (gust >= ef1RangeBottom)
			{
				efRating =  1;
			}
			else
			{
			}
			
			System.out.println("EF Rating is " + efRating);
			

		}
		//output if invalid input
		else
		{
			System.out.println("Input must be a whole number 65 or greater");
		}
		
				in.close();
	}
}