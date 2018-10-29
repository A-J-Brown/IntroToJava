public class SimpleArrayBrown
{
	//Aleksander Brown
	public static void main(String[]args)
	{
		double[] array = new double[15];
		
		//fill array with random doubles
		for(int i=0; i < array.length; i++)
		{
			double random;
			double max = 100;
			double min = 0;
			random = (double)(Math.random() * (max-min + 1)) + min ;
			
			array[i] = random;
			
		}
		
		//print array values by index
		for(int i=0; i < array.length; i++)
		{
			System.out.printf("\n%.2f", array[i]);
		}
	}
}