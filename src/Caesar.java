import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// Read in message
		System.out.println("What's the message?");
		String message = in.nextLine();
		System.out.println("What's the letter shiftng by?");

		// Read in shift
		char shift = in.nextLine().toUpperCase().charAt(0);
		int numShift = (int) (shift - 'A');

		// Loop through message

		String output = ""; // create an empty string
		for (int x = 0; x < message.length(); x++) {
			char letter = message.charAt(x);

			// if letter is alphabetic
			if (Character.isAlphabetic(letter)) {
				// shift your letter
				letter += numShift;
				if (letter > 'Z') {
					
					// subtract 26
					letter -= 26;
				}
			}
			 
			// apply shift
			output += letter; // add the shifted letter to the output.

			// if letter is past 'Z'

		}
		// add letter to output

		// print output
		System.out.println(output);
	}
}
