package com.incubyte.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest 
{
	StringCalculator scref=new StringCalculator();
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
		assertEquals(scref.add("1,5,1"),7);
	}
	

}
