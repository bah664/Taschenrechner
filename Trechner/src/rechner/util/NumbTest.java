package rechner.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumbTest {
	@Test
	public void isNumbaTest(){
		assertTrue(Numb.isNumb("1"));
		assertTrue(Numb.isNumb("1.1"));
		assertFalse(Numb.isNumb("q"));
		assertTrue(!Numb.isNumb("a"));
		assertFalse(!Numb.isNumb("123456789"));
		assertTrue(!Numb.isNumb("a"));
		assertTrue(!Numb.isNumb("0a"));
		assertTrue(Numb.isNumb("0"));
		assertFalse(Numb.isNumb(""));
		assertFalse(Numb.isNumb("01"));
		
	}
//https://github.com/bah664/Taschenrechner.git
}
