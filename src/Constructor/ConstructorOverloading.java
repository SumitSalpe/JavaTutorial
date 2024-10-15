package Constructor;

public class ConstructorOverloading {
	
	private String bookName;
	private String authorName;
	private double price;
	public ConstructorOverloading()
	{
		this.bookName = "unknown";
		this.authorName = "unknown";
		this.price = 0.00;
	}
	public ConstructorOverloading(String bookName, String authorName)
	{
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = 0.00;
	}
	public ConstructorOverloading(String bookName, String authorName, double price)
	{
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co1 = new ConstructorOverloading();
		System.out.println("Book Name: " + co1.bookName);
		System.out.println("Author Name: " + co1.authorName);
		System.out.println("Price: " + co1.price);
		
		ConstructorOverloading co2 = new ConstructorOverloading("The Self-Taught Software Tester","Chhavi Raj Dosaj");
		System.out.println("Book Name: " + co2.bookName);
		System.out.println("Author Name: " + co2.authorName);
		System.out.println("Price: " + co2.price);
		
		ConstructorOverloading co3 = new ConstructorOverloading("Complete Guide to Test Automation","Arnon Axelrod",6000.00);
		System.out.println("Book Name: " + co3.bookName);
		System.out.println("Author Name: " + co3.authorName);
		System.out.println("Price: " + co3.price);
	}

}
