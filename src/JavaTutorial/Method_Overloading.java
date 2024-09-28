package JavaTutorial;
//changing number of arguments
class adder{
	static int add(int a, int b)
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

public class Method_Overloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(adder.add(4,4));
		System.out.println(adder.add(5,5,10));
	}

}
