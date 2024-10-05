package JavaExercises;

import java.util.Scanner;

public class ValidateLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Year");
	      int year = sc.nextInt();
	      boolean x = (year % 4) == 0;
	      boolean y = (year % 100) != 0;
	      boolean z = ((year % 100 == 0) && (year % 100 == 0));
	      
	      if(x && (y || z))
	      {
	        System.out.println(year + " is Leap year");
	      }
	      else
	      {
	        System.out.println(year + " is not a Leap year");
	      }
	}

}
