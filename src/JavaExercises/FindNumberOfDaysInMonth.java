package JavaExercises;

import java.util.Scanner;

public class FindNumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number");
		int month = sc.nextInt();
		System.out.println("Enter Year");
		int year = sc.nextInt();
		String MonthOfName;
		int daysOfMonth = 0;
		switch (month)
		{
		case 1 : MonthOfName = "January";
			daysOfMonth  = 31;
		break;
		case 2 : MonthOfName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
			    {
		        daysOfMonth = 29;
		      } 
		      else 
		      {
		        daysOfMonth = 28;
		      }
		break;
		case 3 : MonthOfName = "March";
			daysOfMonth  = 31;
		break;
		case 4 : MonthOfName = "April";
			daysOfMonth  = 30;
		break;
		case 5 : MonthOfName = "May";
			daysOfMonth  = 31;
		break;
		case 6 : MonthOfName = "June";
			daysOfMonth  = 30;
		break;
		case 7 : MonthOfName = "July";
			daysOfMonth  = 31;
		break;
		case 8 : MonthOfName = "August";
			daysOfMonth  = 31;
		break;
		case 9 : MonthOfName = "September";
			daysOfMonth  = 30;
		break;
		case 10 : MonthOfName = "October";
			daysOfMonth  = 31;
		break;
		case 11 : MonthOfName = "November";
			daysOfMonth  = 30;
		break;
		case 12 : MonthOfName = "December";
			daysOfMonth  = 31;
		break;

		default : MonthOfName = "Invalid month";
		}
		System.out.println(month + "th month is " + MonthOfName + " and number of days " + daysOfMonth);
	}

}
