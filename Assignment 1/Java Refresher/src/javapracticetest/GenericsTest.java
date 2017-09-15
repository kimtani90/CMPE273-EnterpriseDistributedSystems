package javapracticetest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javapractice.Generics;

public class GenericsTest {
	
	Generics gen;
		
	Integer[] intArray = { 3,5,1,6 };
	Double[] doubleArray = { 3.3, 2.2, 4.4, 1.1 };
	Character[] charArray = {'b', 'a', 'd', 'c'};
	
	@Before
	public void setUp() throws Exception {

		gen=new Generics();
	  
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInteger() {
		
		assertEquals(gen.sort(intArray), new Integer[]{1,3,5,6});
		
	}
	
	@Test
	public void testDouble() {
		
		assertEquals(gen.sort(doubleArray), new Double[]{1.1,2.2,3.3,4.4});
		
	}
	
	@Test
	public void testCharacter() {
		
		assertEquals(gen.sort(charArray), new Character[]{'a','b','c','d'});
		
	}

}
