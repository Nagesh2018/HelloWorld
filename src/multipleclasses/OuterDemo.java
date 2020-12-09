package multipleclasses;

public class OuterDemo {
	int num;
	// inner class
	private class Inner_Demo {
		public void print() {
			System.out.println("This is an inner class");
		}
	}
	//Accessing he inner class from the method within
	void display_Inner() {
		Inner_Demo inner = new Inner_Demo();
		inner.print();
	}

	public void checkOuter() {
		System.out.println("from outer class");
	}
	
	private void priMet() {
		System.out.println("from private method");
	}
}

