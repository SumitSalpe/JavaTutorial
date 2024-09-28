package JavaTutorial;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalWord = "Hello";
		String reverseWord = "";
		for(int i = 0; i<originalWord.length();i++)
		{
			reverseWord = originalWord.charAt(i)+reverseWord;
		}
		System.out.println("Reversed string: "+ reverseWord);
	}
}
