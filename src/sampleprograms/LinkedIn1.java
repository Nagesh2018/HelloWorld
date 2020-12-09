package sampleprograms;


import java.util.ArrayList;
import java.util.List;

public class LinkedIn1 {
public static void main(String[] args) {
List list = new ArrayList();
list.add("hell");
list.add(2);
System.out.println(list.get(0) instanceof Object);
System.out.println(list.get(0) instanceof Integer);
String abs = new String("test");
System.out.println(abs);
}
}
