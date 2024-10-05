package JavaExercises;

import java.util.Scanner;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Input an alphabet: ");
		String input = in.next().toLowerCase();

		boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
		/*
		 * input.charAt(0): This method retrieves the character at index 0 of the input
		 * string, which is the first character. >= 65 && <= 90: These values refer to
		 * the ASCII (or Unicode) values for uppercase letters: 65: The ASCII value for
		 * 'A'. 90: The ASCII value for 'Z'.
		 */
		boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
		/*
		 * >= 97 && <= 122: These values refer to the ASCII values for lowercase
		 * letters: 97: The ASCII value for 'a'. 122: The ASCII value for 'z'.
		 */
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o")
				|| input.equals("u");

		if (input.length() > 1) {
			System.out.println("Error. Not a single character.");
		} else if (!(uppercase || lowercase)) {
			System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
		} else if (vowels) {
			System.out.println("Input letter is Vowel");
		} else {
			System.out.println("Input letter is Consonant");
		}
	}

}
