package rechner.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class TermTest{
	@Test
	public void malRechnenTest(){
		int a = 2, b = 3, erg = a*b;
		assertTrue(erg != 2);
		assertFalse(erg != 6);
		}
	@Test
	public void plusRechnenTest(){
		int a = 2, b = 3, erg = a+b;
		assertFalse(erg != 5);
		assertTrue(erg != 6);
	}
	@Test
	public void minusRechnenTest(){
		int a = 2, b = 3, erg = a-b;
		assertTrue(erg < 1);
		assertTrue(erg != 6);
	}
	@Test
	public void durchRechnenTest(){
		int a = 2, b = 3, erg = a/b;
		assertTrue(erg < 2);
		assertTrue(erg != 6);
	}

}
