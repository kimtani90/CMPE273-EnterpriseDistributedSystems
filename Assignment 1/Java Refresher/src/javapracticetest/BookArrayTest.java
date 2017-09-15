package javapracticetest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javapractice.Book;
import javapractice.BookArray;

public class BookArrayTest {

	BookArray[] bookArr=new BookArray[3];
	BookArray b= new BookArray();
	/*Book b1=new Book("Angels and Demons", 1);
	Book b2=new Book("Harry Potter", 2);
	Book b3=new Book("Fault in our stars", 3);
	*/
	
	BookArray b1=new BookArray("Angels and Demons", "Jeffery Archer");
	BookArray b2=new BookArray("Harry Potter", "JK Rowling");
	BookArray b3=new BookArray("Game of Thrones", "George R R Martin");
	
	@Before
	public void setUp() throws Exception {
		
		bookArr[0]=b1;
		bookArr[1]=b2;
		bookArr[2]=b3;		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		
		assertEquals(b2, b.findAuthor(bookArr, "JK Rowling"));
	}
	
	@Test
	public void test2() {
		
		assertEquals(b3, b.findAuthor(bookArr, "George R R Martin"));
	}

}
