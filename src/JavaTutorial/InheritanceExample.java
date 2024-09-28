package JavaTutorial;

class employee {
	int salary = 40000;
}

class programmer extends employee {
	int bonus = 60000;
}

public class InheritanceExample {
	public static void main(String[] args) {
		programmer p = new programmer();
		System.out.println("Programmer salary is:  "+p.salary);
		System.out.println("Bonus of Programmer is:  "+p.bonus);
	}
}

//Programmer is the subclass and Employee is the superclass.
//The relationship between the two classes is Programmer IS-A Employee. 
//It means that Programmer is a type of Employee.