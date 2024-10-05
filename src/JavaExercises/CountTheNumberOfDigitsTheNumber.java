package JavaExercises;

import java.util.Scanner;

public class CountTheNumberOfDigitsTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();	
		int digit = 0;
		if(num < 10)
		{
			digit = 1;
		}
		else if (num > 10 && num < 100)
		{
			digit = 2;
		}
		else if(num >= 100 && num < 1000)
		{
			digit = 3;
		}
		else if(num >= 1000 && num < 10000)
		{
			digit = 4;
		}
		else if(num >= 10000 && num < 100000)
		{
			digit = 5;
		}
		else if(num >= 100000 && num < 1000000)
		{
			digit = 6;
		}
		else if(num >= 1000000 && num < 10000000)
		{
			digit = 7;
		}
		else
		{
			System.out.println("The number is not an integer");
		}
		System.out.println("Number of digits in the number: " + digit);
	}

}
