import java.util.Scanner;

public class AverageAgeLoopBrown
{ 
	//Aleksander Brown
	
	
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		int numOfAges = 0;
		int counter = 0;
		double avgAge = 0;
		int ageSum = 0;
		
		System.out.print("How many ages will you enter? ");
		numOfAges = in.nextInt();
		counter = numOfAges;
		
		while (counter > 0)
		{
			int age = 0;
			System.out.print("Enter Age: ");
			age = in.nextInt();
			ageSum = ageSum + age;
			counter --;
		}
		
		avgAge = ((double)ageSum / (double)numOfAges);
		System.out.print("Average age is " + avgAge + ".");
		
		in.close();
	}
}