package JavaExercises;

import java.util.Scanner;

public class displayPatternRightAngleTriangleWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		int i;
		for(i = 1; i <= num; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
