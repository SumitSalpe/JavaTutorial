package JavaTutorial;

class A
{
	void eat()
	{
		System.out.println("Eating");
	}
}

class B extends A
{
	void eat()
	{
		System.out.println("Eating Bread");
	}
	void bark()
	{
		System.out.println("Barking");
	}
	void work()
	{
		super.eat();
		eat();
		bark();
	}
}


public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//super can be used to invoke parent class method.
		B b = new B();
		b.work();
	}

}
