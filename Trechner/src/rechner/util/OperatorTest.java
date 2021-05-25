package rechner.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperatorTest{
	@Test
	public void isOperatorTest(){
		assertTrue(Operator.isOperator("+"));
		assertTrue(Operator.isOperator("*"));
		assertTrue(Operator.isOperator("/"));
		assertFalse(!Operator.isOperator("-"));
		assertTrue(!Operator.isOperator("0"));
		assertTrue(!Operator.isOperator("a"));
		assertTrue(!Operator.isOperator("0a"));
		assertFalse(Operator.isOperator(" "));
		assertFalse(Operator.isOperator(""));
		assertFalse(Operator.isOperator("01"));
	}
}