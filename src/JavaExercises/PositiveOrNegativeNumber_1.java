package JavaExercises;

import java.util.Scanner;

public class PositiveOrNegativeNumber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter num");
		  double num = sc.nextDouble();
		    if(num > 0)
		    {
		      if(num < 1)
		      {
		        System.out.println("Positive small number");
		      }
		      else if(num > 1000000)
		      {
		        System.out.println("Positive large number");
		      }
		      else
		      {
		        System.out.println("Positive number");
		      }
		    }
		    else if(num < 0)
		    {
		      if(Math.abs(num) < 1)
		      {
		        System.out.println("Negative small number");
		      }
		      else if(Math.abs(num) > 1000000)
		      {
		        System.out.println("Negative Large number");
		      }
		      else
		      {
		        System.out.println("Negative number");
		      }
		    }
		    else
		    {
		      System.out.println("Zero number");
		    }
	}

}
