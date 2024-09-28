package JavaTutorial;

class Animal1{
	String color = "Black";
}

class Dog1 extends Animal1{
	String color = "White";
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class TestSuper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//super is used to refer immediate parent class instance variable.
		Dog1 d = new Dog1();
		d.printColor();
	}

}
