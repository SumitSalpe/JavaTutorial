package Constructor;

public class ParameterizedConstructor {

	private String name;
	private String color;
	public ParameterizedConstructor(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor pc = new ParameterizedConstructor("German Shepherd","Brown");
		System.out.println("Cat's Name: " + pc.name);
		System.out.println("Cat's Name: " + pc.color);
	}

}
