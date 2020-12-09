package sampleprograms;

public class StringOperations {

	public static void main(String[] args) {
		String str = new String("MyStringMy");
		System.out.println(str.substring(1,5));
		System.out.println(str.concat(" ABD"));
		System.out.println(str.compareTo("MyStrin"));
		System.out.println(str.endsWith("String"));
		System.out.println(str.lastIndexOf('g'));
		System.out.println(str.replaceAll("My", "/"));
		System.out.println(str.replace("My", "/"));
		System.out.println(str.replaceFirst("My", "/"));
		System.out.println(str.join("-","java","is"));
	}
	
	public void someTest() {

	}
}
