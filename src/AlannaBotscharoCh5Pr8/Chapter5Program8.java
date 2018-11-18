package AlannaBotscharoCh5Pr8;
import java.util.Scanner; 

/*
 * Alanna Botscharow
 * 11/18
 * Phone key pad
 */
public class Chapter5Program8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input LETTERS.
		
		System.out.println("Please enter a letter: ");
		
		//user input
		
		char ch = input.nextLine().charAt(0);
 
		
		
		//if statements
			//display
		
		if (ch == 'a'
				|| ch == 'A'
				|| ch == 'b'
				|| ch == 'B'
				|| ch == 'c'
				|| ch == 'C') {
			System.out.println("The number on the key pad would be 2");
		}
		else if (ch == 'd'
				|| ch == 'D'
				|| ch == 'e'
				|| ch == 'E'
				|| ch == 'f'
				|| ch == 'F') {
			System.out.println("The number on the key pad would be 3");
		}
		else if (ch == 'g'
				|| ch == 'G'
				|| ch == 'h'
				|| ch == 'H'
				|| ch == 'i'
				|| ch == 'I') {
			System.out.println("The number on the key pad would be 4");
		}
		else if (ch == 'j'
				|| ch == 'J'
				|| ch == 'k'
				|| ch == 'K'
				|| ch == 'l'
				|| ch == 'L') {
			System.out.println("The number on the key pad would be 5");
		}

		else if (ch == 'm'
				|| ch == 'M'
				|| ch == 'n'
				|| ch == 'N'
				|| ch == 'o'
				|| ch == 'O') {
			System.out.println("The number on the key pad would be 6");
		}
		else if (ch == 'p'
				|| ch == 'P'
				|| ch == 'q'
				|| ch == 'Q'
				|| ch == 'r'
				|| ch == 'R'
				|| ch == 's'
				|| ch == 'S') {
			System.out.println("The number on the key pad would be 7");
		}
		else if (ch == 't'
				|| ch == 'T'
				|| ch == 'u'
				|| ch == 'U'
				|| ch == 'v'
				|| ch == 'V') {
			System.out.println("The number on the key pad would be 8");
		}
		else if (ch == 'w'
				|| ch == 'W'
				|| ch == 'x'
				|| ch == 'X'
				|| ch == 'y'
				|| ch == 'Y'
				|| ch == 'z'
				|| ch == 'Z') {
			System.out.println("The number on the key pad would be 9");
		}
		else {
			System.out.println("Whatever you entered is invalid. Make sure that you are entering a letter!");
		}
		
		
		
		
	}

}
