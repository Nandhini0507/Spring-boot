package com.example.JunitExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class junit {

	Calc cl;
	
	@BeforeEach
	void check()
	{
		cl=new Calc();
	}
	
	@Test
	void testfun()
	{
		assertEquals(25,cl.multiply(5, 5));
	}
	
	/*
	 * @BeforeAll
	 * @BeforeEach
	 * @Test
	 * @AfterEach
	 * @AfterAll
	 * @Timeout
	 * @ParameterizedTest
     * @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
	 */
	
	@Test
	void testfun1()
	{
		assertNotEquals(20,cl.multiply(5, 5));
	}
	
	@Test
	void testfun2()
	{
		assertEquals(0,cl.multiply(5,0));
	}
	@Test
	void testfun3()
	{
		assertNotEquals(1,cl.multiply(5,0));
	}
	
	@Test 
	void testfun4()
	{
		assertNotEquals(0.0,cl.multiply(0,0));
	}
}
