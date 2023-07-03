package javaProject.tests;

public class UnitTests {

	public int squre(int n) {
		return n*n;
	}
	public  int sum(int a, int b) {
		return a + b;
	}

	public  int sub(int a, int b) {
		return a - b;
	}

	public  int mul(int a, int b) {
		return a * b;
	}

	public  int div(int a, int b) {
		return a / b;
	}

	public  String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public  String anagramString(String str) {
		String rev = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(rev)) {
			return "Given String is Anagram : " + str;
		} else {
			return "Given String is NOT Anagram : " + str;
		}

	}
}
