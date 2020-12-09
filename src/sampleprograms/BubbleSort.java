package sampleprograms;

public class BubbleSort {
	
public static void main(String[] args) {
	int [] arr={23,1,12,4,5,61,18,7};
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if (arr[j]>arr[j+1]) {
				temp = arr[j] ;
				arr[j]=arr[j+1];
				arr[j+1]= temp;
			}
		}
		for (int k : arr) {
			System.out.println(k);
		}
		System.out.println("*******");

	}
	
}

}
