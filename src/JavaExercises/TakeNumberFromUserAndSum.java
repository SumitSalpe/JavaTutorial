package JavaExercises;

import java.util.Scanner;

public class TakeNumberFromUserAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number");
	    int n = sc.nextInt();
	    int i;
	    int sum = 0;
	    for (i = 1; i<=n; i++)
	    {
	      System.out.println(i);
	      sum = sum + i;  
	    }
	    System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);

	}

}
