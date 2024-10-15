package Constructor;

public class DefaultConstructor {

	private String name;
	private int age;
	public DefaultConstructor()
	{
		this.name = "unknown";
		this.age = 0;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println("Cat's Name: " + dc.getName());
		System.out.println("Cat's Name: " + dc.getName());
	}

}
