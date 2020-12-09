package multipleclasses;

import java.lang.reflect.InvocationTargetException;

public class AccessClass {
		   public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		      //Instantiating the outer class
		      OuterDemo outer = new OuterDemo();
		      
		      //Accessing the display_Inner() method.
		      outer.display_Inner();
		      outer.checkOuter();

		   }
		}
