package com.example.JunitExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class mockito {
	
	@Mock
	private Calc c;
	
	 @Test
	 public void test()
	 {
		 when(c.multiply(4, 5)).thenReturn(20);
		 when(c.multiply(5, 5)).thenReturn(25);
		 
		 int res1=c.multiply(4,5);
		 int res2=c.multiply(5,5);
		 
		 assertEquals(20,res1);
		 assertEquals(25,res2); 
	 }
}
