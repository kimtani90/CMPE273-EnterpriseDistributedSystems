package javapracticetest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javapractice.Book;
import javapractice.Library;
import javapractice.MlkLibrary;

public class MLKLibraryTest {
	
	Library lib;
	List<Book> list = new ArrayList<>();

	Book b1=new Book("Angels and Demons", 1);
	Book b2=new Book("Harry Potter", 2);
	Book b3=new Book("Fault in our stars", 3);
	
	@Before
	public void setUp() throws Exception {
		lib= new MlkLibrary();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindBook() {
		
		assertEquals(lib.findBook("Angels and Demons", list), true);
	}

}
