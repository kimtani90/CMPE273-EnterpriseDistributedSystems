package javapracticetest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javapractice.ReverseWordStack;

public class ReverseWordStackTest {
	
	ReverseWordStack rev;
	
	@Before
	public void setUp() throws Exception {
		rev= new ReverseWordStack();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseWord() {
		
		String word="United States";
		
		assertEquals(rev.reverseWord(word), "setatS detinU");
		
	}
	
	@Test
	public void testReverseWord2() {
		
		String word="CMPE273";
		
		assertEquals(rev.reverseWord(word), "372EPMC");
		
	}

}
