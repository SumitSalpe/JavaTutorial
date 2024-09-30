package JavaExercises;

import java.util.Scanner;

public class verifythreedecimalequalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		double num1 = sc.nextDouble();
		System.out.println("Enter number2");
		double num2 = sc.nextDouble();
		num1 = (num1 * 1000) / 1000;
		num2 = (num2 * 1000) / 1000;
		if (num1 == num2) {
			System.out.println(num1 + " Matched " + num2);
		} else {
			System.out.println("Not matched");
		}
	}

}
