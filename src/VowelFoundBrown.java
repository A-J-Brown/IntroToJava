import java.util.Scanner;

public class VowelFoundBrown
{	
	//Aleksander Brown

	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		final String sentinal = "exit";
		String phrase = "";
		//check for sentinal value
		 while(!phrase.equals(sentinal))
		 {
			 System.out.print("Please enter a phrase: ");
			 phrase = in.nextLine().toLowerCase();
			 //break loop if sentinal met
			 if(phrase.equals(sentinal))
			 {
				 break;
			 }
			 else
			 {
				 //evaluate letters for vowels
				 for(int i = 0; i < phrase.length(); i++)
				 {
					String sub = phrase.substring(i, i+1);
					
					//System.out.println(sub);
					
					if(sub.equals("a") || sub.equals("e") || sub.equals("i")
							|| sub.equals("o") || sub.equals("u"))
					{
						System.out.println("Vowel Found at " + (i+1));
						break;
					}

				 }

			}

		 }
		 
		in.close();
	}
}