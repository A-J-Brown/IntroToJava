public class MultiplicationTableBrown
{
	//Aleksander Brown
	public static void main(String[]args)
	{
		final int row = 12 ;
		final int col = 12;
		for (int i =1; i<=row; i++)
		{
			for (int c = 1; c <=col; c++)
			{
				System.out.printf("%4d",  i*c);
			}
			System.out.println();
		}
	}
}