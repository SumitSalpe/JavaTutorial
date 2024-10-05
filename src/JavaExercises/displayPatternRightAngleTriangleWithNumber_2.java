package JavaExercises;

import java.util.Scanner;

public class displayPatternRightAngleTriangleWithNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, num, k = 1;
		System.out.print("Enter Num");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(k++);
			System.out.println("");
		}
	}

}
