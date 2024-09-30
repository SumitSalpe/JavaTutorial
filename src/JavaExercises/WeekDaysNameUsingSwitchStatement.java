package JavaExercises;

import java.util.Scanner;

public class WeekDaysNameUsingSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		String nameOfDay;
		switch(num)
		{
		case 1 : nameOfDay = "Monday";
		break;
		case 2 : nameOfDay = "Tuesday";
		break;
		case 3 : nameOfDay = "Wednesday";
		break;
		case 4 : nameOfDay = "Thursday";
		break;
		case 5 : nameOfDay = "Friday";
		break;
		case 6 : nameOfDay = "Saturday";
		break;
		case 7 : nameOfDay = "Sunday";
		break;
		default : nameOfDay = "Invaid day";
		}
		System.out.println("Weekday for day number " + num + " is " + nameOfDay);
	}

}
