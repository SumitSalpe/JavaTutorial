package JavaTutorial;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String inputString = sc.nextLine();
		String reversedString = reverseString(inputString);
		System.out.println("Reversed string: " + reversedString);
		sc.close();
	}

	private static String reverseString(String str)
	{
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;	
		while (left < right)
		{
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
            right--;
		}
		 return new String(charArray);
	}
}
