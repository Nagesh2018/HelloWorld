package sampleprograms;

import java.util.Arrays;

public class ArrayRelated {

	public static void main(String[] args) {
//		double[] intArr = {4,5,2,67,1,2.1, 0.9};
//		findArrayLowest(intArr);
//		sortString("nagesh");
		containsString("My nagshe Name is nagesh","genahs");
	}
	static void findArrayLowest(double[] myarr) {
		double minVal = myarr[0];
		for(int i=0;i<myarr.length;i++) {
			if (myarr[i]< minVal) {
				minVal = myarr[i];
			}
		}
		System.out.println("Min Array Val from Program is "+ minVal);
		Arrays.sort(myarr);
		System.out.println("Min Array Val from ArraySort is "+myarr[0]);
	}

	public static void sortString(String str) {
		char[] toChar = str.toCharArray();
		Arrays.sort(toChar);
		System.out.print(toChar);
	}
	
	// contains string in any order
	static void containsString(String givenString, String toCheckString) {
		char[] tochk1 = toCheckString.toCharArray();
		Arrays.sort(tochk1);
		String[] split = givenString.split(" ");
		int count = 0;
		for(String str:split) {
			char[] gStr1 = str.toCharArray();
			Arrays.sort(gStr1);
			if (Arrays.equals(gStr1, tochk1)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
