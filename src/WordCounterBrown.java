import javax.swing.JOptionPane;

public class WordCounterBrown
{
	public static void main(String[]args)
	{
		String phrase = JOptionPane.showInputDialog("Enter a string of words: ");
		
		int count = countWords(phrase);
		
		JOptionPane.showMessageDialog(null, "There are " + count + " words in your string.");
		
	}
	public static int countWords(String str)
	{
		
		int count =1 ;
		
		for(int i = 0; i < str.length(); i++) {
			String sub = str.substring(i, i+1);
			
			if(sub.equals(" ")) {
				count++;
			}
		}
		
		return count;
	}
}