package com.incubyte.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	StringCalculator scref = new StringCalculator();
	@Test 
	void emptyInput() 
	{ 
		assertEquals(scref.add(","),0);
	}
    @Test 
    void singleInput() 
    {
    	assertEquals(scref.add("1,"),1); 
    }
	@Test 
	void mulipleInput() 
	{ 
		assertEquals(scref.add("1,5"),6);
	}
	 @Test 
	 void allowNewLine()
	 { 
		 assertEquals(scref.add("1\n2,3"),6); 
	 }
	 @Test
	 void differentDelimiterCheck() 
	 {
		assertEquals(scref.add("//;\n1;2"), 3);
     }
	 @Test
	 void negativeNumberCheck() 
	 {
		scref.add("//;\n-1;-2");
	 }

}
