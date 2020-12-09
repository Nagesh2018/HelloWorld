package sampleprograms;
import java.util.HashSet;
import java.util.Set;

public class CharacterAndStringArrayDups {

	public static void main(String[] args) {
		String[] str = {"H","A","S","H","M","A","P","H"};
		String[] stri = {"Java","CSharp","CSharp"};
		findDups(stri);
	}

	public static void findDups(String[] strr) {
		Set<String> tSet = new HashSet<String>();
		for(int i=0;i<=strr.length;i++) {
			for (int j=i+1;j<=strr.length-1;j++) {
				if(strr[i]==strr[j]) {
					tSet.add(strr[i]);
				}
			}
		}
		for (String dups : tSet) {
			System.out.println(dups);
		}
	}


}
