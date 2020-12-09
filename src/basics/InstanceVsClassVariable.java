package basics;

public class InstanceVsClassVariable {
int myvar;
static int myStaticVar = 10;

public static void main(String[] args) {
	InstanceVsClassVariable instVar = new InstanceVsClassVariable();
	
	System.out.println("Instance Variable " +instVar.myvar);
	System.out.println("Class Static Variable "+ InstanceVsClassVariable.myStaticVar);
}
}
