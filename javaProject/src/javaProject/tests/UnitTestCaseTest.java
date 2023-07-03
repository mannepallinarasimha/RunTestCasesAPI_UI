package javaProject.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestCaseTest {

	@Test
	public void squareTest() {
		UnitTests obj1 = new UnitTests();
		int output_f  = obj1.squre(4);
		//test the output 
		assertEquals(16, output_f);
	}
	
	@Test
	public void sumTest() {
		UnitTests obj1 = new UnitTests();
		int output_f  = obj1.sum(10, 5);
		//test the output 
		assertEquals(15, output_f);
	}
	@Test
	public void subTest() {
		UnitTests obj1 = new UnitTests();
		int output_f  = obj1.sub(10, 5);
		//test the output 
		assertEquals(5, output_f);
	}
	@Test
	public void mulTest() {
		UnitTests obj1 = new UnitTests();
		int output_f  = obj1.mul(10, 5);
		//test the output 
		assertEquals(50, output_f);
	}
	@Test
	public void divTest() {
		UnitTests obj1 = new UnitTests();
		int output_f  = obj1.div(10, 5);
		//test the output 
		assertEquals(2, output_f);
	}
	@Test
	public void anagramTest() {
		UnitTests obj1 = new UnitTests();
		String str = "infosys";
		String output_f  = obj1.anagramString(str);
		//test the output 
		assertEquals("Given String is NOT Anagram : " + str, output_f);
	}
	
	@Test
	public void reverseTest() {
		UnitTests obj1 = new UnitTests();
		String str = "infosys";
		String output_f  = obj1.reverseString(str);
		//test the output 
		assertEquals("sysofni", output_f);
	}

}
