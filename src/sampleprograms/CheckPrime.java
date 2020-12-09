package sampleprograms;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Check");
		int num = sc.nextInt();
		if (checkPrime(num)) {
			System.out.println("Is Prime");
		}
		else {
			System.out.println("not Prime");
		}
	}

	private static boolean checkPrime(int num) {
		boolean isPrime = true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
