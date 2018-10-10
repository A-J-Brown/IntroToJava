public class DataTypeDemoBrown
{
	//Aleksander Brown
	
	/*Write a program called "DataTypeDemoYourLastName" (where YourLastName is replaced by your last name) that does the following:

Declare and initialize one variable of each data type to an appropriate value:
int
double
float
boolean
short
long
byte
char
Print out the variable as part of a witty statement or line using a System.out.println( ) statement.  For example:
I hope I score at least a 9.9 on this assignment (where 9.9 is a double variable).
Next, create eight constants, one for each of the primitive data types in Java.
Again, print out the constant variable as part of a witty statement or line.  For example:
This assignment was tons of fun: true  (where true is a boolean constant variable initialized to true)
Add your name as a comment at the top of your class.
*/
	
	public static void main(String[]args)
	{
		int firstInt = 1;
		double firstDouble = 3.14;
		float firstFloat = 1.50f;
		boolean firstBoolean = false;
		short firstShort = 2105;
		long firstLong = 12345678910L;
		byte firstByte = 16;
		char firstChar = 'P';
		
		System.out.print("This is my " + firstInt + "st time taking Java. ");
		System.out.println("If I do well in this course, I am going to treat myself to some " + firstDouble + "! ");
		System.out.print("I like Pi enough that I will likely have " + firstFloat + " pieces. ");
		System.out.println("That will make " + firstShort + " pieces of Pi eaten this year!");
		System.out.print("Some say Pi is not that good but I say that is " + firstBoolean + "! ");
		System.out.println("It is so good that I plan to eat " + firstLong + " pieces ");
		System.out.print("in the next " + firstByte + " years!");
		System.out.println("Do you like " + firstChar + "i?");
		
		final int secondInt = 1;
		final double secondDouble = 3.14;
		final float secondFloat = 1.50f;
		final boolean secondBoolean = false;
		final short secondShort = 2105;
		final long secondLong = 12345678910L;
		final byte secondByte = 16;
		final char secondChar = 'P';
		
		System.out.println("");
		System.out.print("This is my " + secondInt + "st time taking Java. ");
		System.out.println("If I do well in this course, I am going to treat myself to some " + secondDouble + "! ");
		System.out.print("I like Pi enough that I will likely have " + secondFloat + " pieces. ");
		System.out.println("That will make " + secondShort + " pieces of Pi eaten this year!");
		System.out.print("Some say Pi is not that good but I say that is " + secondBoolean + "! ");
		System.out.println("It is so good that I plan to eat " + secondLong + " pieces ");
		System.out.print("in the next " + secondByte + " years!");
		System.out.println("Do you like " + secondChar + "i?");
		
	}
}