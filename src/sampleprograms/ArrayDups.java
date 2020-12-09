package sampleprograms;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDups {

	public static void main(String[] args) {
		ArrayDups pr = new ArrayDups();
	    int[] arr = {4,12,1,1,23,5,16,4};
	    pr.checkDups(arr);
	    pr.checkDuplicatesinArray(arr);
	}
	
	public void checkDups(int[] intArr) {
		TreeSet<Integer> mySet = new TreeSet<Integer>();
		for (int i=0;i<=intArr.length-1;i++) {
			if (mySet.contains(intArr[i])) {
				System.out.println(intArr[i] + " is Duplicated ");
			}
			else {
				mySet.add(intArr[i]);
			}
		}
	}
	
	public void checkDuplicatesinArray(int[] arr1) {
		Set<Integer> tSet = new HashSet<Integer>();
		for(int i=0;i<=arr1.length;i++) {
			for (int j=i+1;j<=arr1.length-1;j++) {
				if(arr1[i]==arr1[j]) {
					tSet.add(arr1[i]);
				}
			}
		}
		for (Integer dups : tSet) {
			System.out.println(dups);
		}
	}

}
