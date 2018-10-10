import java.util.Scanner;

public class Week4SwitchTest
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		String units = "feet";
		int inches = 0; 
		int measurement = 3; 

		switch ( units ) {
		  case "inches":
		      inches = measurement;
		      break;
		  case "feet":
		      inches = measurement * 12;
		      break;
		  case "yards":
		      inches = measurement * 36;
		      break;    
		  case "miles":
		      inches = measurement * 12 * 5280;
		      break;
		  default:       System.out.println("Illegal unit of measure.");

		} 

		System.out.println(inches);
		
		//question 3
		
		int x = 8;

		switch (x) {
		    case 10:
		       x += 15;
		       break;
		    case 12:
		       x -= 5;
		       break;
		    default:
		       x *= 3;
		}

		System.out.println(x);
		
		//question 4
		

switch(3)
{ 
     case 1: System.out.println("Apple"); break;
     case 2: System.out.println("Banana"); break;
     case 3: System.out.println("Peach"); 
     case 4: System.out.println("Pear"); 
     case 5: System.out.println("Pineapple"); break;
     default : System.out.println("Cantaloupe"); break;
}



		     
		     in.close();
		
	}
}