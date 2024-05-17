package com.example.JunitExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class addjunit {
	Addition add;
	@BeforeEach
	void check1()
	{
		add=new Addition();
	}

	@Test
	void check2() {
		assertNotEquals(2.2,add.add(1.1, 1.1));
	}
	
	@Test
	void check3() {
		assertNotEquals(2,add.add(1.1, 1.1));
	}
	
}
