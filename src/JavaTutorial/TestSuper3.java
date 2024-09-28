package JavaTutorial;

class Q
{
	Q()
	{
		System.out.println("Q is created");
	}
}

class W extends Q
{
	W()
	{
		super();
		System.out.println("W is created");  
	}
}


public class TestSuper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		W w = new W();
	}

}
