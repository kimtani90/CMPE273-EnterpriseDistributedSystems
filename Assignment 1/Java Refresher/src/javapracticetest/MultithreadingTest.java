package javapracticetest;

import static org.junit.Assert.assertEquals;

import java.lang.management.ThreadInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javapractice.Multithreading;

public class MultithreadingTest {
	
	Multithreading m;
	
	Thread r1=new Multithreading();
	Thread r2=new Multithreading();
	Thread r3=new Multithreading();
	
	@Before
	public void setUp() throws Exception {
		m= new Multithreading();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMutliThreading() {
		
		/*ExecutorService ex=Executors.newFixedThreadPool(3);
		
		ex.execute(r1);
		ex.execute(r2);
		ex.execute(r3);*/
		
		r1.start();
		r2.start();
		r3.start();
		
		assertEquals(r1.isAlive(), true);
		assertEquals(r2.isAlive(), true);
		assertEquals(r3.isAlive(), true);
		
	}

}
