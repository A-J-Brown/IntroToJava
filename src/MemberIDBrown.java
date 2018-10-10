import java.util.Scanner;

public class MemberIDBrown
{
	//Aleksander Brown
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		//define and initiate string and 6 string sections
		String id = "";
		char str1;
		String str2 = "";
		String str3 = "";
		String str4 = "";
		String str5 = "";
		char str6;
		
		
		//prompt for id and convert to uppercase
		System.out.print("Enter Member ID: ");
		id = in.next();
		id = id.toUpperCase();
		
		//separate string into sections for formatting output	
		str1 = id.charAt(0);
		str2 = id.substring(1,4);
		str3 = id.substring(4,8);
		str4 = id.substring(8,10);
		str5 = id.substring(10,13);
		str6 = id.charAt(13);
		
		//output
		System.out.print(str1 + "-" + str2 + " " + str3 + " " + str4 + "-" + str5 + " (" + str6 + ")");
		
		
		in.close();
		
	}
}