package statickeys;

public class ClassB{

	public static void main(String[] args) {
		ClassA.main(null);
		System.out.println(ClassA.str);
		ClassA.methodA();
		ClassA.innerClass c = new ClassA.innerClass();
		c.msg();
	}
}
