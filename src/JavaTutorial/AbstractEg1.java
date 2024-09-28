package JavaTutorial;

abstract class RBI {
	abstract int getRateOfInterest();
}

class KOTAK extends RBI {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends RBI {
	int getRateOfInterest() {
		return 8;
	}
}

class AbstractEg1 {
	public static void main(String args[]) {
		RBI b = new KOTAK();// if object is PNB, method of PNB will be invoked
		int interest = b.getRateOfInterest();
		System.out.println("Rate of Interest is: " + interest + " %");
	}
}