import java.util.Scanner;

public class RandomNumbersBrown
{
	//Aleksander Brown
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int random = 0;
		int number = 0;
		
		System.out.print("How many numbers would you like to see? ");
		number = in.nextInt();
		System.out.print("What is the smallest number you would like to see? ");
		min = in.nextInt();
		System.out.print("What is the largest number you would like to see? ");
		max = in.nextInt();
		
		for(int i=1; i <=number; i++)
		{
			random = (int)(Math.random() * (max-min + 1)) + min ;
			System.out.println(random);
		}
		
		in.close();
	}
}