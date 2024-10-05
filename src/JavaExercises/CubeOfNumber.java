package JavaExercises;

import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number");
	    int n = sc.nextInt();
	    int i;
	    for (i = 1; i <= n; i++)
	    {
	      System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i*i*i));
	    }
	}

}
