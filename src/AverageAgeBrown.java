import java.util.Scanner;

public class AverageAgeBrown
{ 
	//Aleksander Brown
	
	
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How old is Amelia? ");
		int amelia = in.nextInt();
		System.out.print("How old is Aleyna? ");
		int aleyna = in.nextInt();
		System.out.print("How old is Joyce? ");
		int joyce = in.nextInt();
		System.out.print("How old is Roger? ");
		int roger = in.nextInt();
		
		double avgAge = 0;
		
		avgAge = ((double)amelia + (double)aleyna + (double)joyce + (double)roger) / 4;
		
		System.out.println("Amelia's age is " + amelia + ".");
		System.out.println("Aleyna's age is " + aleyna + ".");
		System.out.println("Joyce's age is " + joyce + ".");
		System.out.println("Roger's age is " + roger + ".");
		System.out.println("The average age is " + avgAge + " years old.");
		
		in.close();
	}
}