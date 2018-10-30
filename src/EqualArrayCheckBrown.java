
public class EqualArrayCheckBrown
{
	//Aleksander brown
	public static void main(String[]args)
	{
		boolean equal1 = false;
		boolean equal2 = false;
		boolean equal3 = false;
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[5];
		int[] array4 = new int[10];
		String outputFalse = "not equal.";
		String outputTrue = "equal.";
		
		//fill 2 arrays with same random int
		for(int i=0; i < array1.length; i++){
			int random;
			int max = 20;
			int min = 1;
			random = (int)(Math.random() * (max-min + 1)) + min ;
			
			array1[i] = random;
			array2[i] = random;			
		}
		
		for(int j=0; j < array3.length; j++) {
			int random;
			int max = 20;
			int min = 1;
			random = (int)(Math.random() * (max-min + 1)) + min ;
			
			array3[j] = random;
		}
		
		for(int k=0; k < array3.length; k++) {
			int random;
			int max = 20;
			int min = 1;
			random = (int)(Math.random() * (max-min + 1)) + min ;
			
			array3[k] = random;
		}
		
		equal1 = areArraysEqual(array1, array2);
		equal2 = areArraysEqual(array1, array3);
		equal3 = areArraysEqual(array1, array4);
		
		if(equal1) {
			System.out.println("Array 1 and 2 are " + outputTrue);
		}
		else {
			System.out.println("Array 1 and 2 are " + outputFalse);
		}
		if(equal2) {
			System.out.println("Array 1 and 3 are " + outputTrue);
		}
		else {
			System.out.println("Array 1 and 3 are " + outputFalse);
		}
		if(equal3) {
			System.out.println("Array 1 and 4 are " + outputTrue);
		}
		else {
			System.out.println("Array 1 and 4 are " + outputFalse);
		}
		
		
		
	}
	
	public static boolean areArraysEqual(int[] arr1, int[] arr2)
	{
		boolean equal = false;
		boolean size = false;
		boolean same = true;
		
		if(arr1.length == arr2.length) {
			size = true;
		}
		for(int i=0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				same = false;
				break;
			}
		}
		
		if(size && same) {
			equal = true;
		}
		
		return equal;
	}
}