package JavaExercises;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int x = in.nextInt();
		if (x > 0)
		{
			System.out.println("You entered Positive number");
		}
		else if(x < 0)
		{
			System.out.println("You entered Negative number");
		}
		else
		{
			System.out.println("You entered zero");
		}
	}

}
