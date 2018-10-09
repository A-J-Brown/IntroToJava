import java.util.Scanner;

public class VowelCountBrown
{	
	//Aleksander Brown

	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String word = in.nextLine().toLowerCase();
		
		int count = 0;
		
		 for(int i = 0; i < word.length(); i++)
		 {
			String sub = word.substring(i, i+1);
			
			//System.out.println(sub);
			
			if(sub.equals("a") || sub.equals("e") || sub.equals("i")
					|| sub.equals("o") || sub.equals("u"))
			{
			count++;
			//System.out.println(count);
			}
		 }
		 
		 if(count == 0)
		 {
			 for(int i = 0; i < word.length(); i++)
			 {
					String sub = word.substring(i, i+1);
					
					//System.out.println(sub);
					
					if(sub.equals("y"))
					{
					count++;
					//System.out.println(count);
					}
			 }
		 }
		 
		 if(count == 0)
		 {
			 System.out.println("You must have a spelling error.");
		 }
		 else
		 {
			System.out.println( count + " Vowel in " + word);
		 }
			
		in.close();
	}
}