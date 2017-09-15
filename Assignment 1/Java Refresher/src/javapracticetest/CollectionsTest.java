package javapracticetest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javapractice.Book;
import javapractice.BookArray;
import javapractice.Collections;
import javapractice.Student;

public class CollectionsTest {

	Book b1=new Book("Angels and Demons", 1);
	Book b2=new Book("Harry Potter", 2);
	Book b3=new Book("Fault in our stars", 3);
	
	Student s1=new Student("Sam", 1);
	Student s2=new Student("Kit", 2);
	
	Map<Book, Student> map;
	
	Collections coll;
	
	@Before
	public void setUp() throws Exception {
		
		map=new HashMap<>();
		
		map.put(b1,s1);
		map.put(b2,s1);
		map.put(b3,s2);
		
		coll=new Collections();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Set<Student> list = new HashSet<>();
		
		list.add(s1);
		assertEquals(list, coll.checkBooksIssued(map) );
	}

}
