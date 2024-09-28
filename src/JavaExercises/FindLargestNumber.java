package JavaExercises;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		System.out.println("Enter third number: ");
		int third = sc.nextInt();
		if (first > second)
			if (first > third)
				System.out.println("Largest Number " + first);

		if (second > first)
			if (second > third)
				System.out.println("Largest Number " + second);
		
		if(third > first)
			if(third > second)
				System.out.println("Largest Number " + third);
	}

}
