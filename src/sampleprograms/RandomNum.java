package sampleprograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNum {

	public static void main(String[] args) {
//		randomNum();
		randomApache();
	}

	private static void randomNum() {
		Random rd = new Random();
		System.out.println(rd.nextInt(1000));
		System.out.println(rd.nextDouble());
		System.out.println(Math.random());
	}
	
	public static void randomApache() {
	    String generatedString = RandomStringUtils.randomAlphabetic(8);
	    System.out.println(generatedString);
	    System.out.println(RandomStringUtils.randomAlphanumeric(4, 9));
	    System.out.println(RandomStringUtils.randomNumeric(4, 5));

	}

}
