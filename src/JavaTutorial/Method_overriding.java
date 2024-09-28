package JavaTutorial;

class car{
	void run()
	{
		System.out.println("car is running");
	}
}

class Bike extends car{
	void run()
	{
		System.out.println("Bike is running");
	}
}

public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.run();
	}

}
