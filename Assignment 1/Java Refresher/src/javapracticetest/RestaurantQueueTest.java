package javapracticetest;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javapractice.RestaurantQueue;

public class RestaurantQueueTest {

	RestaurantQueue r;

	RestaurantQueue o1= new RestaurantQueue(1, "Sam");
	RestaurantQueue o2= new RestaurantQueue(2, "Kit");
	RestaurantQueue o3= new RestaurantQueue(3, "Ron");
	
	Queue<RestaurantQueue> queue=new LinkedList<>();
	
	@Before
	public void setUp() throws Exception {
		
		r=new RestaurantQueue();
		
		
		
		queue.add(o1);
		queue.add(o2);
		queue.add(o3);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void restaurantQueueTest() {
		
		
		assertEquals(o1, r.processOrder(queue));
		assertEquals(o2, r.processOrder(queue));
		assertEquals(o3, r.processOrder(queue));
	}

}
