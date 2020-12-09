package multipleclasses;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PClass2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
	    Class<?> c = Class.forName("multipleclasses.PClass1");
	    PClass1 pc = (PClass1) c.newInstance();
	    Method m = c.getDeclaredMethod("foo");
	    m.setAccessible(true);
	    m.invoke(pc);

	}

}
