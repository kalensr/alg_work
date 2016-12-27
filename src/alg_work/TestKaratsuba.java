package alg_work;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKaratsuba {

	@Test
	public void test1() {
		Karatsuba k = new Karatsuba();
		String num1 = "78";
		String num2 = "21";
		
		int answer = k.karatsuba(num1, num2);
		assert(1638==answer);
	

	}
	@Test
	public void test2() {
		Karatsuba k = new Karatsuba();
		String num1 = "33";
		String num2 = "43";
		
		int answer = k.karatsuba(num1, num2);
		assert(1419==answer);
	

	}
	@Test
	public void test3() {
		Karatsuba k = new Karatsuba();
		String num1 = "33";
		String num2 = "43";
		
		int answer = k.karatsuba(num1, num2);
		assert(1638!=answer);
	

	}
	
	//@Test
	public void test_big1() {
		Karatsuba k = new Karatsuba();
		String num1 = "7821";
		String num2 = "2132";
		
		int answer = k.karatsuba(num1, num2);
		System.out.println(answer);
		assert(16674372==answer);
	

	}

}
