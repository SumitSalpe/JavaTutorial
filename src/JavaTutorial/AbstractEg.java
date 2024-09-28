package JavaTutorial;

abstract class Bike1 {
	abstract void run();
}

public class AbstractEg extends Bike1 {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 obj = new AbstractEg();
		obj.run();
	}

}
