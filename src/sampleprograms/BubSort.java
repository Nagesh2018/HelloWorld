package sampleprograms;

public class BubSort {

	public static void main(String[] args) {
		int[] myInt = {23,45,67,55,3,6,88,34};

		int temp;
		for(int i=0;i<myInt.length;i++) {
			for(int j=0;j<myInt.length-1;j++) {
				if (myInt[j+1]<myInt[j]) {
					temp=myInt[j+1];
					myInt[j+1]=myInt[j];
					myInt[j]= temp;
				}
			}
		}
		
		for(int in:myInt) {
			System.out.println(in);
		}
}
}