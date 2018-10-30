/*
Write a program called "RandomTenYourLastName.java".  Using a for loop and Math.random, initialize an array with ten random integers between 1 and 20.  Then, print these eight lines of output:

Every element in the array
Every element at an even index
Every even element
All elements in reverse order
First element
Last element
Highest element
Lowest element
Important notes:

Your program should not use magic numbers in your for loops.  This means that you should use your arrayName.length to find out what the last element is.  In your code, the only 10 that should be present is on the first array declaration.  I should easily be able to modify your array declaration to be 11 or 12 or 32 and your program should still function.
Create and use variables in your Math.random statement.  It should not be:  int randNum = 1 + (int) (Math.random() * 20);

As a reminder: If the remainder when you divide by 2 is 0, it's even. % is the operator to get a remainder.
Your program should use at least one enhanced for loop.
*/

public class RandomTenBrown
{
	//Aleksander Brown
	public static void main(String[]args)
	{
		int[] array = new int[10];
		
		Fill(array);
		All(array);
		EvenIndex(array);
		Even(array);
		Reverse(array);
		First(array);
		Last(array);
		MaxValue(array);
		MinValue(array);
		
	}
	public static int[] Fill(int[] num)
	{
		
		//fill array with random int
		for(int i=0; i < num.length; i++)
		{
			int random;
			int max = 20;
			int min = 1;
			random = (int)(Math.random() * (max-min + 1)) + min ;
			
			num[i] = random;
		}
		
		return num;
		
	}
	public static void All(int[] num)
	{
		System.out.print("All numbers in array: ");
		//print array values by index
		for(int i=0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
	}
	public static void EvenIndex(int[] num)
	{
		System.out.print("\nNumbers at Even index positions: ");
		//print array values by index
		for(int i=0; i < num.length; i++)
		{
			if( i % 2 == 0)
			{
				System.out.print(num[i] + " ");
			}
		}
	}
	public static void Even(int[] num)
	{
		System.out.print("\nEven numbers in array: ");
		//print array values by index
		for(int i=0; i < num.length; i++)
		{
			if( num[i] % 2 == 0)
			{
				System.out.print(num[i] + " ");
			}
		}
	}
	public static void Reverse(int[] num)
	{
		System.out.print("\nAll numbers in reverse order: ");
		//print array values by index
		for(int i = num.length -1; i >= 0 ; i--)
		{
			System.out.print(num[i] + " ");
		}
	}
	public static void First(int[] num)
	{
		System.out.print("\nFirst number in array: ");
		System.out.print(num[0]);
	}
	public static  void Last(int[] num)
	{
		System.out.print("\nLast number in array: ");
		System.out.print(num[num.length -1]);
	}
	public static void MaxValue(int[] num) 
	{
		System.out.print("\nMaximum value in array: ");
	    int maxValue = num[0];
	    //find max value
	    for (int i = 1; i < num.length; i++) 
	    {
	        if (num[i] > maxValue) 
	        {
	            maxValue = num[i];
	        }
	    }
	    System.out.print(maxValue);	    
	}
	public static void MinValue(int[] num) 
	{
		System.out.print("\nMinimum value in array: ");
		//find min value
	    int minValue = num[0];
	    for (int i = 1; i < num.length; i++) 
	    {
	        if (num[i] < minValue) 
	        {
	            minValue = num[i];
	        }
	    }
	    System.out.print(minValue);
	}
}