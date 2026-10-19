import java.util.Scanner;
public class Vigenere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Read in message
		System.out.println("What's the message?");
		String message = in.nextLine();
		System.out.println("What's the shift word?");
		//Read in shift word
		char Shiftword = in.nextLine().toUpperCase().charAt(0);
		//Loop through message
		
		for (int x=0;x<message.length();x++){
			char letter = message.charAt(x);
		

			//if letter is alphabetic
		if (Character.isAlphabetic(letter)) {
			letter += Shiftword;
			if (letter > 'Z') {
				
				// subtract 26
				letter -= 26;
				}
				//apply shift from the current letter
			
				//move to the next shift letter, loop back to the beginning if necessary
				//if letter is past 'Z'
					//subtract 26
			
			}
		}
			//add letter to output
		
		//print output
	}

}
