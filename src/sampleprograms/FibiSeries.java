package sampleprograms;

public class FibiSeries {
	
public static void main(String[] args) {
//	fibser = (1,2,3,5,8,13,21)
	int num1 = 0;
	int num2 = 1;
	int count = 6;
	
	for (int i=0;i<=count;i++) {
		int newNum = num1+num2;
		System.out.println(newNum + " ");
		int temp  = num2;
		num1 = num2;
		num2 = newNum;
		
	}
	
}
}
