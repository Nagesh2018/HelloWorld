package basics;

public class Literals {
	
public static void main(String[] args) {
	char w = 'q';
	char x = '\u0054';
	char y = 0x63;
	char z = '\f';
	System.out.println(w + "*****" +x + "*****" + y + "*****" + z);
	comp();
}

static void comp() {
	String str1 = "HelloA";
	String str2 = "HelloA";
	System.out.println(str2.compareTo(str1));
}
}
