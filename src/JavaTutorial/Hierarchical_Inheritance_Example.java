package JavaTutorial;
//When two or more classes inherits a single class, it is known as hierarchical inheritance.

class Vehicle{
	void Bike()
	{
		System.out.println("Bikes");
	}
}
class Kawasaki extends Vehicle{
	void Ninja()
	{
		System.out.println("Ninja");
	}
}
class Yamaha extends Vehicle{
	void YZF()
	{
		System.out.println("R3");
	}
}

public class Hierarchical_Inheritance_Example {
	public static void main(String args[]){  
	Yamaha y = new Yamaha();
	y.Bike();
	y.YZF();
	}
}
