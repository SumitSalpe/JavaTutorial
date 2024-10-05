package JavaExercises;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number");
	    int num = sc.nextInt();
	    int i;
	    int multi = 0;
	    for (i = 0; i <= 10; i++)
	    {
	      multi = num * i;
	      System.out.println(num + " X " + i + " = " + multi);
	    }
	}

}
