import java.util.Scanner;

public class RockPaperScissorsBrown
{
	//aleksander brown
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Player one: Rock,Paper or Scissors?: ");
		String playerOne = in.next().toLowerCase();
		
		System.out.print("Player two: Rock,Paper or Scissors?: ");
		String playerTwo = in.next().toLowerCase();

		
		String oneWins = "Player One Wins!";
		String twoWins = "Player Two Wins!";
		String tie = "Tie.";
		
		String output = "";
		
		
		if (playerOne.equals("rock"))
		{
			if (playerTwo.equals("rock"))
			{
				output = tie;
			}
			else if (playerTwo.equals("paper"))
			{
				output = twoWins;
			}
			else
			{
				output = oneWins;
			}
		}
		else if (playerOne.equals("paper"))
		{
			if (playerTwo.equals("rock"))
			{
				output = oneWins;
			}
			else if (playerTwo.equals("paper"))
			{
				output = tie;
			}
			else
			{
				output =  twoWins;
			}			
		}
		else
		{
			if (playerTwo.equals("rock"))
			{
				output = twoWins;
			}
			else if (playerTwo.equals("paper"))
			{
				output = oneWins;
			}
			else
			{
				output = tie;
			}
			
		}
		
		System.out.println(output);		
		
		in.close();
	}
}