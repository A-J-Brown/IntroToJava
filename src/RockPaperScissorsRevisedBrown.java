import java.util.Scanner;

public class RockPaperScissorsRevisedBrown
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
		
		
		switch (playerOne)
		{
		case "rock":
			switch (playerTwo)
			{
			case "rock": output = tie; break;
			case "paper": output = twoWins; break;
			case "scissors": output= oneWins; break;
			default:output = "invalid input";break;
			}
			break;
		case "paper":
			switch (playerTwo)
			{
			case "rock": output = oneWins; break;
			case "paper": output = tie; break;
			case "scissors": output = twoWins; break;
			default: output = "invalid input";break;
			}
			break;
		case "scissors":
			switch (playerTwo)
			{
			case "rock": output = twoWins; break;
			case "paper": output = oneWins; break;
			case "scissors": output = tie; break;
			default: output = "invalid input"; break;
			}
			break;
		default:output = "invalid input!"; break;
		}
			
		System.out.println(output);		
		
		in.close();
	}
}