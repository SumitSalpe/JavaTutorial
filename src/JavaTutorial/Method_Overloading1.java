package JavaTutorial;
//changing data type of arguments
class adder1{
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(double a, double b, double c)
	{
		return a+b+c;
	}
}

public class Method_Overloading1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(adder1.add(4,4));
		System.out.println(adder1.add(5.0,5.5,9.5));
	}

}
