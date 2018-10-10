import java.util.Scanner;

public class MadLibsBrown
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		String name = "";
		String creature = "";
		String terrain = "";
		String object3 = "";
		String verb = "";
		String adjective = "";
		
		System.out.print("Enter a Name: ");
		name = in.next();
		System.out.print("Enter a creature: ");
		creature = in.next();
		creature = creature.toLowerCase();
		System.out.print("Enter a type of terrain: ");
		terrain = in.next();
		terrain = terrain.toLowerCase();
		System.out.print("Enter an object: ");
		object3 = in.next();
		object3 = object3.toLowerCase();
		System.out.print("Enter a present tense verb: ");
		verb = in.next();
		verb = verb.toLowerCase();
		System.out.print("Enter an adjective: ");
		adjective = in.next();
		adjective = adjective.toLowerCase();
		
		System.out.println("One day, while walking some " + terrain + ",");
		System.out.println(name + " came upon a(n) " + creature + " that was");
		System.out.println(verb + " with its " + object3 + " that was very " + adjective + ".");
		
		in.close();
	}
}