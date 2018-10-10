import java.util.Scanner;

public class CompareNumbersBrown
{
	//Aleksander Brown
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		boolean greaterThan;
		boolean lessThan;
		boolean equalTo;
		
		System.out.print("Enter a number: ");
		num1 = in.nextInt();
		System.out.print("Enter another number: ");
		num2 = in.nextInt();
		
		greaterThan = num1 > num2;
		lessThan = num1 < num2;
		equalTo = num1 == num2;

		if(equalTo == true)
		{
		System.out.println(num1 + " is equal to " + num2 + ". ");
		}
		else if(greaterThan == true)
		{
		System.out.println(num1 + " is greater than " + num2 + ". ");
		}
		else if(lessThan == true)
		{
		System.out.println(num1 + " is less than " + num2 + ". ");
		}
		
		in.close();
		
	}
}