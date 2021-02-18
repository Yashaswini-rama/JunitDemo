package com.valuemomentum.training.testing.JUnitDemo;

import org.junit.*;
import static org.junit.Assert.*;
public class AssertionTest
{
	@Test
	 public void testAssert(){					
		
	        //Variable declaration		
	        String string1="Junit";					
	        String string2="Junit";					
	        String string3="test";					
	        String string4="test";					
	        String string5=null;					
	        int variable1=1;					
	        int	variable2=2;					
	        int[] airethematicArrary1 = { 1, 2, 3 };					
	        int[] airethematicArrary2 = { 1, 2, 3 };
	        
	        //Assert Statements
	        
	        assertEquals(string1,string2);
	        assertSame(string3,string1);
	        assertNotSame(string1,string4);
	        assertNotNull(string1);
	        assertNull(string5);
	        assertTrue(variable1<variable2);
	        assertArrayEquals(airethematicArrary1, airethematicArrary2);
	}        
	        
}
