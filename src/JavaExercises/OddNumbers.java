package JavaExercises;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		int i;
		for(i = 1; i<= num; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}
				
	}

}
