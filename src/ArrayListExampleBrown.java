/*
 * Complete the following tasks by adding code to this skeleton program. If you are asked to print a value, provide a suitable label to identify it when it is printed.

Invoke add() to enter the following names in sequence: Andy, Angela, Dwight, Erin, Jim, Michael, Pam, Toby. Print the ArrayList again.
Use get() to retrieve and print the names.
Print the size() of the ArrayList.
Use size() to help you print the last name in the list.
Use set() to change “Andy” to “Andy Bernard”. Print the ArrayList to verify the change.
Use the alternate form of add() to insert “Kelly” after “Jim”. Print the ArrayList again.
Use an enhanced for loop to print each name in the ArrayList.
Create a second ArrayList called names2 that is built by calling the ArrayList constructor that accepts another ArrayList as an argument. Pass names to the constructor to build names2. Then print the ArrayList.
Call names.remove(0) to remove the first element. Print names and names2. Verify that Andy Bernard was removed from names, but not from names2. 

 */

import java.util.ArrayList;

public class ArrayListExampleBrown
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
     
       //A.
       names.add("Andy");
       names.add("Angela");
       names.add("Dwight");
       names.add("Erin");
       names.add("Jim");
       names.add("Michael");
       names.add("Pam");
       names.add("Toby");
       System.out.print("Entire array list: ");
       System.out.println(names);
       
       
       //B.
       String output = "";
       for(int i=0; i<names.size(); i++) {
    	  output = output + names.get(i) + ", ";
       }
	   System.out.println("Output all names using get method: " + output);
       
       
       //C
       System.out.println( "Array Size: " + names.size());
       
       
       //D
       System.out.println("Last name in array: " + names.get(names.size()-1));
       
       
       //E
       names.set(0, "Andy Bernard");
       System.out.println("Replaced Andy with Andy Bernard: " + names.get(0));
       
       
       //F
       names.add(5, "Kelly");
       System.out.println("Add Kelly before Jim: " + names);
       
       
       //G
       System.out.print("Print names via enhanced for loop: ");
       for(String element : names) {
    	   System.out.print(element + ", ");
       }
       System.out.println();
       
       
       //H
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println("Print names2 array: " + names2);
       
       
       //I
       names.remove(0);
       System.out.println("Print names array: " + names);
       System.out.println("Print names2 array: " + names2);

   }
} 