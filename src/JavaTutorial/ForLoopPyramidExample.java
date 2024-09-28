package JavaTutorial;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForLoopPyramidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
