package JavaExercises;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A: ");
		int a = sc.nextInt();
		System.out.println("Enter B: ");
		int b = sc.nextInt();
		System.out.println("Enter C: ");
		int c = sc.nextInt();
		double result = b * b - 4.0 * a * c;
		System.out.println("print result: "+ result);
		if(result > 0.0)
		{
			double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
			System.out.println("The roots are "+ r1 + "and" + r2);
		}
		else if (result == 0.0)
		{
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		}
		else 
		{
            System.out.println("The equation has no real roots.");
		}
	}

}
